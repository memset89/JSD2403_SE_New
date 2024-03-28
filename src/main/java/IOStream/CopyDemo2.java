package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./src/main/java/IOStream/img.jpg");
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/img3.jpg");
        int b;
        int len=0;
        byte[] buf = new byte[1024*1000];
        long start = System.currentTimeMillis();
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf,0,len);//无损写法
            //fos.write(buf);
        }

//        while ((b = fis.read()) != -1) {
//            fos.write(b);
//            //System.out.println(b);
//        }
        long end = System.currentTimeMillis();
        System.out.printf("复制完成,耗时%fs",1.0*(end-start)/1000);
        fis.close();
        fos.close();
    }
}
