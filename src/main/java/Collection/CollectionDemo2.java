package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2{
    public static void main(String[] args)
    {
       Collection a = new ArrayList();
       a.add(new Point(1,2));
       a.add(new Point(3,4));
       a.add(new Point(5,6));
       a.add(new Point(7,8));
        /**
         *
         */
        System.out.println(a);
        Point p = new Point(1,2);
        Point p2= new Point(3,4);
        a.add(p);
        System.out.println(a);
        System.out.println(a.contains(p2));
    }
}
