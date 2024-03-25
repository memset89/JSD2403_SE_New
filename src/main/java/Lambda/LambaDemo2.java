package Lambda;

import java.io.File;
import java.io.FileFilter;

public class LambaDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };
        // lambda表达式写法
        FileFilter filter = file->file.getName().endsWith(".java");
        //等效
    }
}
