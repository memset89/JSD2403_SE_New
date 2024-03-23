package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();//Integer 不能换为int，因为Integer是对象，int是基本数据类型
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        List<Integer> submit = list.subList(3,8);
        System.out.println(submit);
        //将子集submit每个元素扩大十倍
        for(int i=0;i<submit.size();i++){
            submit.set(i,submit.get(i)*10);

        }System.out.println(submit);
        System.out.println(list);//也大了10倍，操作子集就是操作原集合对应的元素
        list.subList(2,8).clear();
        System.out.println(list);

    }
}
