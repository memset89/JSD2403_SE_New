package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        System.out.println(map.size());
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
        map.remove("1");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        map.forEach((k,y)->System.out.println(k+":"+y));
        Collection x = map.keySet();
        x.forEach(System.out::println);
    }
}
