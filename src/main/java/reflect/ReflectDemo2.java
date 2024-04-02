package reflect;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p = new Person();
        System.out.println(p);

//        Class cls=Class.forName("reflect.Person");
//        Object obj = cls.newInstance();
//        System.out.println(obj);
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个类名：");
        String className=sc.nextLine();
        Class cls=Class.forName(className);
        Object obj = cls.newInstance();
        System.out.println(obj);
    }
}
