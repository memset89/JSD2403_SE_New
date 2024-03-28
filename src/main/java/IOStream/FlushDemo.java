package IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemo {
    public static void main(String[] args) throws Exception, IOException
    {
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/bos.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String str = "Hello";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        bos.write(bytes);
        System.out.println("over");
        bos.flush();//希望过程中主动去一趟   所有输出流都有flush方法
        bos.close();
    }
}
