package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
    //迭代器 ： 问  取  删
    public static void main(String[] args)
    {
        Collection<String> collection = new HashSet<>();
        collection.add("on#e");
        collection.add("#");
        collection.add("two");
        collection.add("#");
        collection.add("th#ree");
        collection.add("#");
        collection.add("four");
        collection.add("#");
        collection.add("five");
        collection.add("#");
        collection.add("six#");
        collection.add("#");
        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext())
//        {
//            String next = iterator.next();
//            System.out.println(next);
//        }//迭代器
        Iterator<String> it = collection.iterator();
        while (it.hasNext()){
            String next = it.next();
            if ("#".equals(next)){
               it.remove();
            }
            System.out.println(next);
        }
        System.out.println(collection);

    }//
}
