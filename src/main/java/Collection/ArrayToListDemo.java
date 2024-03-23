package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args)
    {
        String[] arr = {"a","b","c"};
        System.out.println(Arrays.toString(arr));
        List<String> list=Arrays.asList(arr);
        System.out.println(list);

        list.set(0,"aa");//修改集合元素相当于修改数组元素
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        arr[0]="aaa";//反之亦然  修改数组元素相当于修改集合元素
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        //如果希望对集合增删元素，需要再创建一个集合并包含该集合所有元素即可
        List<String> list2=new ArrayList<>();
        list2.addAll(list);


        List<String> list3=new ArrayList<>();
        System.out.println("list3:"+list3);
        list3.add("eight");
        System.out.println("list3:"+list3);
    }
}
