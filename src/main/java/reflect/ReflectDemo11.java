package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo11 {
    public static void main(String[] args) {
        try {
            Class cls=Class.forName("reflect.Person");
            Method method=cls.getDeclaredMethod("sleep");
            if (method.isAnnotationPresent(AutoRunMethod.class)){
                AutoRunMethod arm=method.getAnnotation(AutoRunMethod.class);
                int value=arm.value();//获取value参数的值
                System.out.println(value);
            }
        }catch (Exception e){
            //e.printStackTrace();
        }
    }
}
