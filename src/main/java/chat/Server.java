package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static sun.security.util.PolicyUtil.getInputStream;

public class Server {
    private ServerSocket serverSocket;
    public Server()
    {
        try {
            System.out.println("服务器启动中");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务器启动成功");
        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    public void start()
    {

        try {
            while (true){
                System.out.println("等待客户端链接");
                Socket socket =serverSocket.accept();
                System.out.println("客户端链接成功");
                InputStream in = socket.getInputStream();
                //String data = in.read();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);
//            String data = br.readLine();
//            System.out.println("客户端说："+data);
                while (true){
                    String data = br.readLine();
                    if (data.equals("exit"))
                    {
                        System.out.println("客户端退出");
                        break;
                    }
                    System.out.println(data);
                }
            }




        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args)
    {
        Server server = new Server();
        server.start();

    }
}
