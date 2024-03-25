package Collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        while (c.size()<10){
            c.add((int)(Math.random()*100));
        }
//        Collections.sort(c, new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2){return o2-o1;}
//        }
//        );
        Collections.sort(c,(o1,o2)->o2-o1);//简写
        //lanba表达式   完全写法
//        Collections.sort(c,(o1,o2)->{
//            if(o1>o2) return 1;
//            else if(o1<o2) return -1;
//            else return 0;
//        });
        System.out.println(c);



    }
}
