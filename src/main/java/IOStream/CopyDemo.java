package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/IOStream/img.jpg");
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/img2.jpg");
        int b;
        long start = System.currentTimeMillis();
        while ((b = fis.read()) != -1) {
            fos.write(b);
            //System.out.println(b);
        }
        long end = System.currentTimeMillis();
        System.out.printf("复制完成,耗时%.2fs",1.0*(end-start)/1000);
        fis.close();
        fos.close();
    }
}
