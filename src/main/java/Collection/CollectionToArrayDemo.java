package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        c.add("six");
        System.out.println(c);
        //Object[] arr=c.toArray();
        String[] array=c.toArray(new String[c.size()]);//也可以是0 但不建议
        System.out.println(Arrays.toString(array));
    }
}
