package IOStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static java.lang.Thread.sleep;

public class ReadStringDemo {
    public static void main(String[] args) throws Exception, IOException {
        File file = new File("./src/main/java/IOStream/《我有一剑》.txt");
        FileInputStream fis =new FileInputStream(file);
        //创建与文件等长的字节数组
        byte[] buffer = new byte[(int)file.length()];
        //一次性将文件中所有字节读入到数组中
        fis.read(buffer);
        String line=new String(buffer, StandardCharsets.UTF_8);
        for (int i = 0;i < line.length(); i++){
            System.out.print(line.charAt(i));
            if (i % 80 == 0 && i != 0){
               Thread.sleep(2000);
            }
        }
        fis.close();

    }
}
