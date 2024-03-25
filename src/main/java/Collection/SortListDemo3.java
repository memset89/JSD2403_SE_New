package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("smith");
        list.add("lucy");
        list.add("lily");
        list.add("lucy");
        list.add("克晶老师");
        list.add("传奇");
        list.add("王伟超");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> {
            return o2.length() - o1.length();
        });
        System.out.println(list);
    }
}
