package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bb");
        list.add("cccc");
        Collections.sort(list, (s1, s2) -> s2.length()-s1.length());
        System.out.println(list);
    }

}
