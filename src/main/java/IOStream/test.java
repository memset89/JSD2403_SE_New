package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test {
    public static void main(String[] args) throws Exception, FileNotFoundException
    {
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/test.txt");
        for (int i = 'a';i<='z';i++){
            fos.write(i);
        }
    }
}
