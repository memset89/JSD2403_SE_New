package homework.day03;

import java.util.Collection;
import java.util.HashSet;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Collection<Integer> c= new HashSet<Integer>();
		while(c.size()<10){
			int num=(int)(Math.random()*100);
			c.add(num);
		}
		System.out.println(c);
	}
}
