package IOStream;

import java.io.*;

public class demo {

    public static void main(String[] args) throws Exception, IOException
    {
        FileInputStream fis = new FileInputStream("./src/main/java/IOStream/《我有一剑》.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/《我有一剑》副本.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        int d;
        byte[] b = new byte[1024];
        int len = 0;

//        while((len = fis.read(b)) != -1)
//        {
//            fos.write(b, 0, len);
//        }
        while ((d=fis.read())!=-1){
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成，耗时：" + (end - start) + "ms");
        bos.close();

    }
}
