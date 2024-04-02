package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class test {
    public static void main(String[] args)
    {
        String line="i love java! thinking in java!! hello world!";
        Map<Character,Integer> map=new HashMap<>();

        for (int i=0;i<line.length();i++){
            if(map.containsKey(line.charAt(i))){
                map.put(line.charAt(i), map.get(line.charAt(i))+1);
            }else{
                map.put(line.charAt(i), 1);
            }
        }

        System.out.println(map);
    }
}
