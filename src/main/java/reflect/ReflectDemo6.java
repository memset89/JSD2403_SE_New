package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls = Class.forName("reflect.Person");
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println("方法名:"+method.getName());
            System.out.println("参数个数:"+method.getParameterCount());
            int modifiers = method.getModifiers();//获取方法的访问修饰符
            System.out.println(modifiers);
            System.out.println("-----访问修饰符:"+Modifier.toString(modifiers));
            switch (modifiers)
            {
                case Modifier.PUBLIC:
                    System.out.println("访问修饰符:public");
                    break;
                case Modifier.PRIVATE:
                    System.out.println("访问修饰符:private");
                    break;
                case Modifier.PROTECTED:
                    System.out.println("访问修饰符:protected");
                    break;
            }
            System.out.println("-------------------------------------------------");
        }
    }
}
