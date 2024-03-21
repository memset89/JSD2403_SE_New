package doc;

public class IndexOfDemo {
    public static void main(String[] args) {
        String line="sssssss in   java";
        int index=line.indexOf("in");
        System.out.println(index);
        index =line.indexOf("IN");
        System.out.println(index);
    }
}
