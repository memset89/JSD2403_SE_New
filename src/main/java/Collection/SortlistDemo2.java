package Collection;

import java.util.*;

public class SortlistDemo2 {
    public static void main(String[] args)
    {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1, 2));
        list.add(new Point(3, 4));
        list.add(new Point(5, 6));
        list.add(new Point(7, 8));
        list.add(new Point(9, 10));
        list.add(new Point(11, 12));
        list.add(new Point(14, 14));
        Collections.sort(list, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int len1=o1.getX()* o1.getX()+o1.getY()* o1.getY();
                int len2=o2.getX()* o2.getX()+o2.getY()* o2.getY();
                return len1-len2;
            }
        });
        System.out.println(list);
    }
}
