package homework.day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 * 
 * 
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		File dir = new File("./src/main/java/homework/day05/");
		if (dir.isDirectory()){
			File[] subs=dir.listFiles(file->file.isFile());
			for (File sub:subs){
				String name=sub.getName();
				String string1=name.substring(0,name.lastIndexOf("."));
				String string2=name.substring(name.lastIndexOf("."));
				String newName=string1+"_cp"+string2;
				FileInputStream fis=new FileInputStream(sub);
				FileOutputStream fos=new FileOutputStream(newName);
				byte[] buffer=new byte[1024*10];
				int len;
				while ((len=fis.read(buffer))!=-1){
					fos.write(buffer,0,len);
				}
				fos.close();
				fis.close();
			}
		}
		System.out.println("复制完成");
		
	}
}




/**
 * 思路:
 * 分为几部分考虑.
 * 第一个是要获取到当前目录中的所有文件(思考哪个API可以解决)
 * 第二个是获取到的每一个文件都要复制(复制用什么API)
 * 第三个是复制的文件名，如何重新组建xxx_cp.xxx的名字?
 *      这里要将原文件名拆开后想办法拼接_cp.
 */


