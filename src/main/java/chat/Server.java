package chat;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static sun.security.util.PolicyUtil.getInputStream;
public class Server {
    private ServerSocket serverSocket;
    //private List<PrintWriter> allOut=new ArrayList<>();
    private Map<String,PrintWriter> allOut=new HashMap<>();
    public Server() {
        try {
            System.out.println("服务器启动中");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务器启动成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void start (){
        try {
            while(true) {
                System.out.println("等待客户端链接...");
                /*
                ServerSocket的重要方法:
                Socket accept()
                该方法是一个阻塞方法，调用该方法后程序会"卡住"，直到一个客户端使用
                Socket与服务端建立链接为止，此时accept方法会立即返回一个Socket
                通过返回的Socket就可以与链接的客户端双向通讯了。
             */
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端链接了!");
                Thread t = new Thread(new ClientHandler(socket));
                t.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
        //ClientHandler clientHandler = new ClientHandler(socket);
        //Thread t = new Thread(clientHandler);
    }
    private class ClientHandler implements Runnable {
        private Socket socket;
        private String ip;
        PrintWriter pw = null;
        String nickname="";
        public ClientHandler(Socket socket){
            this.socket = socket;
            ip=socket.getInetAddress().getHostAddress();
        }
        public void run() {

            try {
                    InputStream in = socket.getInputStream();
                    //String data = in.read();
                    InputStreamReader isr = new InputStreamReader(in);
                    BufferedReader br = new BufferedReader(isr);
                    //
                    OutputStream out = socket.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(out,StandardCharsets.UTF_8);
                    BufferedWriter bw = new BufferedWriter(osw);
                    pw = new PrintWriter(out,true);
                    //
                    nickname=br.readLine();
                    synchronized (allOut){
                        allOut.put(nickname,pw);
                    }
                    //将该客户端的输出流存入集合中
                    //String y=;
                    sendMessage("欢迎"+nickname+"加入聊天室,当前在线人数："+allOut.size());
                    //System.out.println(nickname+"加入聊天室,当前在线人数："+allOut.size());
                    while (true) {
                        String data = br.readLine();
                        if (data.equals("exit")) {
                           // System.out.println("客户端退出");

                            break;
                        }
                       // System.out.println(nickname+"["+ip+"]"+":"+data);
                        if (data.startsWith("@")) {
                            sendMessageSomeone(data);
                        }else {
                            sendMessage(nickname+"["+ip+"]"+":"+data);
                        }
                        //sendMessage(nickname+"["+ip+"]"+":"+data);
//                        for (PrintWriter o:allOut) {
//                            o.println(nickname+"["+ip+"]"+":"+data);
//                        }
                        //pw.println(nickname+"["+ip+"]"+":"+data);
                    }
                }
                catch (IOException e) {
                    //e.printStackTrace();
                }finally {
                synchronized (allOut) {
                    //allOut.remove(pw);
                    allOut.remove(nickname);
                }
                //allOut.remove(pw);
                //String x = ;
                sendMessage(nickname+"退出聊天室,当前在线人数："+allOut.size());
                //System.out.println(nickname+"退出聊天室,当前在线人数："+allOut.size());
//                for (PrintWriter o:allOut) {
//                    o.println(nickname+"退出聊天室,当前在线人数："+allOut.size());
//                }
                }try {
                socket.close();
            }catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            public void sendMessage(String msg) {
                System.out.println(msg);
                synchronized (allOut) {
                    for (PrintWriter o:allOut.values()) {
                        o.println(msg);
                    }
                }
//                for (PrintWriter o:allOut) {
//                    o.println(msg);
//                }
            }
            public void sendMessageSomeone(String msg) {
            if (msg.matches("@.+:.+")){
                String tonickname = msg.substring(1,msg.indexOf(":"));
                if(allOut.containsKey(tonickname)){
                    PrintWriter pw = allOut.get(tonickname);
                    String content=msg.substring(msg.indexOf(":")+1);
                    pw.println(nickname+"悄悄对你说："+content);
                }
                else {
                    PrintWriter pw = allOut.get(nickname);
                    pw.println("没有找到该用户");
                }
            }
            else {
                PrintWriter pw = allOut.get(nickname);
                pw.println("私聊格式不对,应当是@对方昵称:聊天消息");
            }

            }
        }
    }


