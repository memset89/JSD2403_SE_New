package IOStream;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws Exception, IOException
    {
        FileInputStream fis = new FileInputStream("./src/main/java/IOStream/《我有一剑》.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/《我有一剑》副本.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos, 1024*100);
        long start = System.currentTimeMillis();
        int d;
//        byte[] b = new byte[1024];
//        int len = 0;

//        while((len = bis.read(b)) != -1)
//        {
//            bos.write(b, 0, len);
//        }
        while ((d=bis.read())!=-1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成，耗时：" + (end - start) + "ms");
        bos.close();

    }
}
