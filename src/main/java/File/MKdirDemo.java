package File;
import java.io.File;
import java.io.IOException;
public class MKdirDemo {
    public static void main(String[] args) throws IOException{
//        File dir = new File("./demo");
//        if (dir.exists()){
//            System.out.println("该目录已存在,删了");
//            dir.delete();
//        }
//        else {
//                dir.mkdir();
//                System.out.println("创建成功");
//        }
        File dirs = new File("./demo/demo/demo/a/b/c/d/e");
        if (dirs.exists()){
            System.out.println("该目录已存在,删了");
            dirs.delete();
        }
        else {
            dirs.mkdirs();
            System.out.println("创建成功");
        }
        File dirs1 = new File("./demo");
        dirs1.delete();
        System.out.println("删除成功");
    }
}
