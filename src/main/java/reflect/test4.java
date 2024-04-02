package reflect;
import java.lang.annotation.*;
import java.lang.reflect.*;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class test4 {
    public static void main(String[] args) {
        try {
            /**
             * /**
             *  * 程序启动后，要求输入一个类名
             *  * 如果这个类被注解@AutoRunClass标注了，那么进行实例化，并自动调用该类中所有
             *  * 被注解@AutoRunMethod标注的方法若干次，具体次数有该方法上@AutoRunMethod注解参数决定
             *  *
             *  * 否则输出该类没有被标注
             *  *
             *  * reflect.Person
             *  *
             *  */
            Class<?> cls=Class.forName("reflect.Person");
            //Method method=cls.getDeclaredMethod("sleep");
            if (cls.isAnnotationPresent(AutoRunClass.class)){
                Object obj=cls.newInstance();
                for (Method method:cls.getDeclaredMethods()){

                    if (method.isAnnotationPresent(AutoRunMethod.class)){
                        AutoRunMethod ar=method.getAnnotation(AutoRunMethod.class);
                        int num=ar.value();
                        for (int i=0;i<num;i++){
                            method.invoke(obj);
                        }
                    }
                }
            }
        }catch (Exception e){
            //e.printStackTrace();
        }
    }
}
