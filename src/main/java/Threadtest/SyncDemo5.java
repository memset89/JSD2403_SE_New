package Threadtest;

import java.util.*;

public class SyncDemo5 {
    public static void main(String[] args) {
//        Collection<Integer> a = new ArrayList<>();
//        Collection<Integer> b = new HashSet<>();
//        Collection<Integer> c = new LinkedList<>();
        Set<Integer> b = Collections.synchronizedSet(new HashSet<>());
        Thread t1=new Thread(()->{
           for (int i = 0; i < 1000; i++)  b.add(i);
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++)  b.add(i);
        });
        Thread t3=new Thread(()->{
            for (int i = 0; i < 1000; i++)  b.add(i);
        });
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(b.toString());
    }

}
