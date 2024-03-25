package File;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("./src/main/java/File/demo.txt");
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file);
//        String path=file.getAbsolutePath();
//        System.out.println(path);
        String name=file.getName();
        System.out.println("文件名："+name);
        Long length=file.length();
        System.out.println("文件字节数："+length);
//        Long time=file.lastModified();
//        System.out.println(time);
        boolean cr=file.canRead();
        System.out.println("可读："+cr);
        boolean cw=file.canWrite();
        System.out.println("可写："+cw);
        boolean HD=file.isHidden();
        System.out.println("隐藏："+HD);
        boolean dir=file.isDirectory();
        System.out.println("目录："+dir);
    }


}
