package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,NoSuchMethodException, InvocationTargetException {
//    Person p = new Person();
//    p.hehe();

      Class cls=Class.forName("reflect.Person");
      Object obj=cls.newInstance();
      //Method[] methods=cls.getMethods();
        Method[] methods=cls.getDeclaredMethods();
      Method method = cls.getDeclaredMethod("hehe");
      method.setAccessible(true);
      method.invoke(obj);
      method.setAccessible(false);
    }
}
