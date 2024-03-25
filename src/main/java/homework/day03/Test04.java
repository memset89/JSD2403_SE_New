package homework.day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合第3到第6个元素翻转并输出
 * 
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);
        for (int x=2;x<list.size()/2-1;x++){
            list.set(x, list.set(list.size()-3-x,list.get(x)));
        }
        System.out.println(list);
    }

}
