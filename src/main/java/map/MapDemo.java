package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //新建一个map
        Map<String, Integer> map = new HashMap<>();
        map.put("math", 90);
        map.put("Chinese", 89);
        map.put("English", 100);
        map.put("Physics", 100);
        map.put("Chemistry", 100);
        map.put("Biology", 100 );
        Integer value=map.put("math", 100);
        System.out.printf(String.valueOf(value));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        value=map.get("Biology");
        System.out.println(value);
        value=map.remove("Biology");
        System.out.println(value);
        System.out.println(map);
    }
}
