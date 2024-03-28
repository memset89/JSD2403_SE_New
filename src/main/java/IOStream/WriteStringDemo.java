package IOStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("./src/main/java/IOStream/testW.txt");
//        fw.write("Hello World、d\\/d");
//        fw.write("夜空中最小姐撒谎先把上下班那是先把首先把剩下骄傲撒娇插线板是撒撒 奥斯本按时进行芭莎杯水车薪八十擦拭从八九年出现把三驾马车补码表示的从，京东方的v参加比赛的女成本山东河南成本上的差别上的沙城遍地是产生的 从");
//        fw.close();
        FileOutputStream fos = new FileOutputStream("./src/main/java/IOStream/testW.txt");
        String line  = "Hello Worl已经出现变化就是打d";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写入成功");
        fos.close();
    }
}
