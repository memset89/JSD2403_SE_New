package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1的元素个数为：" + c1.size());
        System.out.println(c1);
        //Collection c2=new ArrayList();
        Collection c2=new HashSet();
        c2.add("c#");
        c2.add("php");
        c2.add("python");
        c2.add("java");
        System.out.println("c2的元素个数为：" + c2.size());
        System.out.println(c2);
        c1.addAll(c2);//取并集的时候注意元素特性  HashSet重复元素放集合时候重复元素放不进来
        System.out.println("c1的元素个数为：" + c1.size());
        System.out.println(c1);
        c2.addAll(c1);
        System.out.println("c2的元素个数为：" + c2.size());
        System.out.println(c2);
        Collection c3=new ArrayList();
        c3.add("java");
        c3.add("c++");
        c3.add("php");
        System.out.println(c1);
        System.out.println(c3);
        c1.retainAll(c3);//仅保留c1中和c3共有的元素
        System.out.println(c1);
        //c3不受影响
        System.out.println(c2);
        System.out.println(c3);
        c2.removeAll(c3);//将c2中和c3共有的元素移除
        System.out.println(c2);
        System.out.println(c3);
        c3.remove("java");//remove删除指定元素
        System.out.println(c3);
        Collection c4=new ArrayList();
        c4.add("javase");
        c4.add("c");
        boolean s=c1.containsAll(c4);
        System.out.println("完全包含:"+s);


    }
}
