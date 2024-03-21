package String;

public class IndexOfDemo {
    public static void main(String[] args) {
        String line="sssssss in   java";
        int index=line.indexOf("in");
        System.out.println(index);
        index =line.indexOf("IN");
        System.out.println(index);
        index =line.indexOf("in",8);
        System.out.println(index);
        index =line.indexOf("ja",9);
        System.out.println(index);

        index=line.lastIndexOf("a");
        System.out.println(index);
    }
}
