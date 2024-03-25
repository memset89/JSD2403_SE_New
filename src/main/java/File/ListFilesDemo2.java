package File;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.Reader;
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File file = new File(".");
        if (file.isDirectory()){
           // File[] files = file.listFiles();
//            FileFilter filter = new FileFilter() {
//                public boolean accept(File pathname) {
//                    String name = pathname.getName();
//
//                    return name.startsWith(".");
//
//                }
//            };
            FileFilter fileFilter=f->f.getName().startsWith(".");
            File[] files = file.listFiles(fileFilter);
            for (File f : files){
                System.out.println(f);
            }
        }
    }
}
