package reflect;


import java.lang.reflect.Method;
import java.util.Scanner;

import static java.lang.String.format;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个类名：");
        String className=sc.nextLine();
        Class cls=Class.forName(className);
        //Class cls=Class.forName("java.lang.String");//获取String的类对象
        String name=cls.getName();//获取类对象所表示的类的完全限定名
        System.out.println(name);
        name=cls.getSimpleName();//仅获取类名
        System.out.println(name);
        Method[] methods=cls.getMethods();
        System.out.println(name+"类的公开方法个数："+methods.length);
        System.out.println(format("类%s的公开方法：",name));
        for(Method m:methods){
            System.out.println(m.getName());
        }

    }
}
