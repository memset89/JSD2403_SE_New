package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class test2 {
    //利用反射机制调用Person类中 本类自己定义的所有无参数且公开的方法
    public static void main(String[] args) {
        try {
            Class c = Class.forName("reflect.Person");
            Method[] methods = c.getDeclaredMethods();
            for (Method m : methods){
                if(m.getParameterCount() == 0&&m.getModifiers() == Modifier.PUBLIC){
                    m.invoke(c.newInstance());
                }
            }
        }catch (Exception e){
            //e.printStackTrace();
        }
    }
}
