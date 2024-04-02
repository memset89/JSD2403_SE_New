package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        System.out.println(p);


        Class c1 = Class.forName("reflect.Person");
        //cls.getConstructor();//Person()

        Constructor c2 = c1.getConstructor(String.class, int.class);
        Object o = c2.newInstance("张三", 18);
        System.out.println(o);
    }
}
