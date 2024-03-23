package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * 增强型for循环
 * 称 新循环 不取代传统for的功能  可以遍历集合和数组
 */

public class NewForDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("ONE");
        c.add("TWO");
        c.add("THREE");
        c.add("FOUR");
        c.add("FIVE");
        System.out.println(c);
        for (Object o:c){
            System.out.println(o);
        }
        /*
        for (String e:c) {
            System.out.println(e);
        }*///如果申请集合的时候已经声明好类型(eg:String) 则可以接受  String e
        String[] arr=new String[]{"ONE","TWO","THREE","FOUR","FIVE"};
        for (String e:arr){
            System.out.println(e);
        }
    }
}
