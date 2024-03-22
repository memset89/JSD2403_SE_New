package Object;

public class Demo extends Object {
    public static void main(String[] args) {
        Point point=new Point(1,2);
        String str=point.toString();
        System.out.println(str);
        System.out.println(point);
        String line="这是一个Point类："+point;
        System.out.println(line);
        Point p2=new Point(1,2);
        System.out.println(p2==point);
        System.out.println(p2.equals(point));

    }
}
