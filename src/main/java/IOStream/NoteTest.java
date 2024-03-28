package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/note.txt");
        String line= "hello world";
        Scanner sc = new Scanner(System.in);
        while (line != null){
            System.out.printf("请输入内容\n");
            line = sc.nextLine();
            if (line.equalsIgnoreCase("exit")){
                System.out.println("保存并退出");
                break;
            }else {
                fos.write(line.getBytes(StandardCharsets.UTF_8));
                fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
            }
        }
        fos.close();

    }
}
