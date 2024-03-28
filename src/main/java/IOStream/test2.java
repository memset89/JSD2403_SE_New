package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/IOStream/test.txt");
        while (true) {
            int b = fis.read();
            if (b == -1) {
                break;
            }
            System.out.print((char) b);
        }
        int d=0;
        while ((d=fis.read())!=-1){
            System.out.print((char)d);
        }
        fis.close();

    }
}
