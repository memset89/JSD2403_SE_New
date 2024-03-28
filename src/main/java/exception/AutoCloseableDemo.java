package exception;

import java.io.FileOutputStream;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("./src/main/java/exception/txt.txt");){
            fos.write(1);
        }catch (Exception e) {
            System.out.println("出错了");
        }

    }
}
