package File;
import java.io.File;
import java.io.IOException;
public class ListFilesDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("./demo");
        if (file.isDirectory()) {
            File[] subs=file.listFiles();
            //获取该目录下所有子项（下一级菜单）
            for (File sub:subs) {
                System.out.println(sub.getName());
            }
        }
    }
}
