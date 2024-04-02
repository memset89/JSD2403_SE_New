package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectDemo10 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入方法名");
            String name = sc.next();
            Class c = Class.forName("reflect.Person");
            Method m = c.getMethod(name);
            boolean x=m.isAnnotationPresent(AutoRunMethod.class);
            if(x){
                //c.toString();
                System.out.println("方法被标注了");
            }else {
                System.out.println("没被标注");
            }



        }catch (Exception e){
        }
    }
}
