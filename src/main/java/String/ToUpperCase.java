package String;

import java.util.Locale;
import java.util.Scanner;

public class ToUpperCase {
    //大写
    public static void main(String[] args) {
        String s="AAAAJHHSXXVskcxkjsdabcdv";
        String upper=s.toUpperCase();
        String lower=s.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        String line="vK63Uk";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入验证码(不区分大小写)"+line);
        String t=scanner.nextLine();
        System.out.println(line.toUpperCase().equals(t.toUpperCase()));
    }


}
