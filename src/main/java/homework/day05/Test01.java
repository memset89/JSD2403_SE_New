package homework.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 改正下面程序的错误
 * 
 * 程序实现的功能需求:复制一个文件
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException, Exception, FileNotFoundException {
		FileInputStream fis = new FileInputStream("./src/main/java/homework/day05/test.txt");
		FileOutputStream fos = new FileOutputStream("./src/main/java/homework/day05/test_cp.txt");

		int d;
		while ((d = fis.read()) != -1) {
			fos.write(d);
		}
		System.out.println("复制完毕!");
		fis.close();
		fos.close();
	}
}




