package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="a";
        for (int i=0;i<1000000;i++){
            str=str+"a";
            System.out.println(i);
        }
        System.out.println("完毕");
    }
}
