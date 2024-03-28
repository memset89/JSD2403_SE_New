package IOStream;
import java.io.*;
public class FOSDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /**
         * 文件输出流常用的构造器：
         * FileOutputStream(File file)
         * 创建文件输出流链接到file表示的文件上
         * FileOutputStream(String name)
         * 创建文件输出流链接到name路径指定的文件上
         */
        FileOutputStream fos = new FileOutputStream("fos.dat");
        fos.write(3567);
        fos.write(2216);
        for (int i = 'a';i<='z';i++){
            fos.write(i);
        }
        System.out.println("文件输出流写出完毕");
        fos.close();
    }
}
