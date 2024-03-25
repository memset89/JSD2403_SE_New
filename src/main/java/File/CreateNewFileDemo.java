package File;
import java.io.File;
import java.io.IOException;
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("./src/main/java/File/test.txt");
        if(file.exists()){
            System.out.println("文件已存在");
        }else{
//            try {
//                file.createNewFile();
//                System.out.println("文件创建成功");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            file.createNewFile();
            System.out.println("文件创建成功");
        }


    }
}
