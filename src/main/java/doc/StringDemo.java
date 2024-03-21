package doc;

public class StringDemo {
    public static void main(String[] args) {
        String s1="123abc";
        String s2="123abc";
        String s3="123abc";
        String s4=new String("123abc");
        System.out.println("s1==s2"+(s1==s2));
        System.out.println("s3==s4"+(s3==s4));

        s1+="?";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s2+="?";
        System.out.println("s1==s2"+(s1==s2));
    }
}
