package String;
import java.lang.String;
import java.sql.Array;
import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "This is a test, just a test";
        String[] result = str.split(",");
        for (String s : result) {
            System.out.println(s);
        }
        String line="sacxjasb12712nbjxcbhdash73y72dbcx723edvx63td";
        String[] result2=line.split("[0-9]+");
        for (String s : result2) {  //将String数组依次输出
            System.out.println(s);
        }
        System.out.println(Arrays.toString(result2));//将String数组整个输出

        String Line ="=abc==def=ghi=========";
        String[] words=Line.split("=");
        System.out.println(words.length);
        System.out.println(Arrays.toString(words));
        Line="asxjb.xskjahxuahx.xkan";
        System.out.println(Line);
        String[] words2=Line.split("\\.");
        System.out.println(Arrays.toString(words2));
        Line="a=sdf=fdv=dsc=d======";
        String[] arr=Line.split("=",3);
        System.out.println(Arrays.toString(arr));
        Line="a=sdf=fdv=dsc=d======";
        arr=Line.split("=",20);
        System.out.println(Arrays.toString(arr));
        String x="abc217jsnxashb93872mxnca3";
        String arrxx=x.replaceAll("[0-9]+","NUMBER");
        System.out.println(arrxx);
        //[null,abc, null,null,def,ghi]
    }
}
