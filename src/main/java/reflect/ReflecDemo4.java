package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

//import static com.sun.nio.zipfs.ZipFileAttributeView.AttrID.method;

//import static com.sun.nio.zipfs.ZipFileAttributeView.AttrID.method;

public class ReflecDemo4 {
    public static void main(String[] args) throws Exception, IllegalAccessException, InstantiationException
    {
//        Person p = new Person("jack");
//        p.sayBye();
//

//        Class c = Class.forName("reflect.Person");
//
//        Constructor cons = c.getConstructor(String.class);
//        cons.newInstance("tom");
//
//        System.out.println(cons);
//        Object o = c.newInstance();
//        Method m = c.getMethod("sayBye");
//        m.invoke(o);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入类名");
        String className=scanner.next();
        System.out.println("请输入方法名");
        String methodName=scanner.next();

        Class c=Class.forName(className);

        Object o=c.newInstance();
        System.out.println("请输入名字:");
        String name=scanner.next();
        Method m=c.getMethod(methodName,String.class);
        m.invoke(o,"基尼太美" );
    }
}
