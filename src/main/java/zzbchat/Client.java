package zzbchat;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//Socket封装了TCP协议的通讯细节，使用他可以喝远端计算机建立网络连接，并基于两条流支持用户通讯
public class Client {
    private Socket socket;
    public Client(){
        try{
            System.out.println("正在连接诶服务端");
            socket = new Socket("176.17.13.62",8088);
            //socket = new Socket("localhost",8088);//127.0.0.1是本机地址也可以写成localhost
            System.out.println("与服务端成功连接");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void start(){
        try{
            Scanner scan = new Scanner(System.in);
            OutputStream out  = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);//自动行刷新
//读取服务器发来的消息
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String nickname = "";
            while(true){
                System.out.println("请输入昵称");
                nickname = scan.nextLine();
                if (nickname.trim().length()>0){
                    pw.println(nickname);
                    break;
                }
                System.out.println("昵称不能为空");
            }
            while (true){
                String line=scan.nextLine();
                if("bye".equalsIgnoreCase(line)){//line写后边防止引起空指针异常，写后边最多返回false
                    break;
                }
                pw.println(line);
                //读服务端的字符串

                line = br.readLine();
                System.out.println(line);

            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();//四次挥手关闭
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}

