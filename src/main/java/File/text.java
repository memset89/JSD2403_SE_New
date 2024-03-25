package File;

import java.io.File;
import java.io.IOException;
public class text {
    public static void main (String[] args) throws IOException{

        for (int i=1;i<=100;i++){
            String x="Rubbish";
            x+=i;
            File file=new File("./src/main/java/Rubbish/"+x+".txt");
            if (file.exists()){
                System.out.println("文件已存在,给你删了");
                file.delete();
            }
            else {
                file.createNewFile();
                System.out.println("文件："+file.getName()+"创建成功");
            }
        }
    }
}
