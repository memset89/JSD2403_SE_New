package reflect;
import java.lang.reflect.Field;
public class ReflectDemo8 {
    public static void main(String[] args) {
        try {
            Class cls=Class.forName("reflect.Teacher");
            Object obj=cls.newInstance();
            Field filed=cls.getDeclaredField("name");
            filed.set(obj,"张三");
            System.out.println(obj);
            Object obj2=filed.get(obj);
            System.out.println(obj2);
        }
        catch (Exception e){

        }
    }
}
