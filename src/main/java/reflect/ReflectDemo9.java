package reflect;

import reflect.annotations.AutoRunClass;

import java.util.Scanner;

public class ReflectDemo9 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入类名");
            String name = sc.next();
            Class c = Class.forName("reflect."+name);
            boolean x=c.isAnnotationPresent(AutoRunClass.class);
            if(x){
                //c.toString();

            }else {
                System.out.println("类上不存在AutoRunClass注解");
            }



        }catch (Exception e){
        }
}
}
