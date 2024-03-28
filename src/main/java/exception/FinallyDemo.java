package exception;

import java.io.FileOutputStream;

public class FinallyDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos=new FileOutputStream("./src/main/java/exception");
            fos.write(97);
        }catch (Exception e) {
            System.out.println("出错了");
        }finally{
            try {
                if(fos!=null)
                    fos.close();
            }catch (Exception e) {
                System.out.println("关闭失败");
            }
        }
    }
}
