package File;

import java.io.File;
import java.io.IOException;
public class Test3 {
    public static void main(String[] args) throws IOException{
        for (char i ='a';i<='z';i++){
            //File dirs = new File(String.valueOf(i));
            //dirs.delete();
            //delete删除目录时  目录必须为空
            //dirs.mkdirs();
            File dirs = new File("./demo/"+i);
            if (dirs.exists()){
                System.out.println("该目录已存在,删了");
                dirs.delete();
            }
            else {
                dirs.mkdirs();
                System.out.println("创建成功");
            }

        }
    }
}
