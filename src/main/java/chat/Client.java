package chat;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//聊天室客户端
public class Client {
    private Socket socket;
    //private String ip;
    /**
     * java.net.Socket 套接字
     * Socket
     */

    public Client() {
        //构造器 用于初始化客户端


        try {
            System.out.println("connection");
            socket = new Socket("localhost", 8088);//176.17.13.62
            System.out.println("connection success");
        }catch (IOException e) {
            e.printStackTrace();
        }

        //localhost 本机地址==>176.17.13.68
    }
    public void start() {
        //启动客户端  客户端用于开始工作的方法
        try {
//            OutputStream outputStream = socket.getOutputStream();
//            //outputStream.write("hello".getBytes());
//            outputStream.write(2);
//            outputStream.flush();
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(writer);
            PrintWriter pw = new PrintWriter(bw, true);
            //



            //


            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入昵称：");
            String nickname;
            while (true){
                nickname = scanner.nextLine();
                if(nickname.trim().length() > 0){
                    pw.println(nickname);
                    break;
                }
            }

            //将接受服务端发送来消息的线程启动
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.setDaemon(true);
            t.start();
            //
           while (true){
               //


               //
               String msg = scanner.nextLine();
                pw.println(msg);
                if("exit".equals(msg)){
                    System.out.println("客户端退出成功");
                   break;
               }
                //

               //
            }


        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();


    }
    private class ServerHandler implements Runnable {
        public void run(){
            try {
                InputStream in = socket.getInputStream();
                //String data = in.read();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);
                String msg;
                while ((msg = br.readLine())!= null){
                    System.out.println(msg);
                }
            } catch (IOException e) {

            }
        }
    }
}
