package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws Exception, IOException {
        String name = "王克晶";
        int age = 18;
        char gender = '女';
        String[] otherInfo = {"黑", "嗓门大", "技术好","大家的老师"};
        Person person = new Person(name,age,gender,otherInfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person);
        System.out.println("序列化成功");
        oos.close();

        /**
         * Exception in thread "main" java.io.NotSerializableException: IOStream.Person
         * 	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
         * 	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
         * 	at IOStream.OOSDemo.main(OOSDemo.java:16)
         * 	序列化对象一定要接口 不然会抛出异常
         * 	import java.io.Serializable;
         * public class Person implements Serializable{
         * 需要用到Serializable接口
         *
         * eg
         *
         * import java.io.FileNotFoundException;
         * import java.io.FileOutputStream;
         * import java.io.IOException;
         * import java.io.ObjectOutputStream;
         *
         * public class OOSDemo {
         *     public static void main(String[] args) {
         *         // 参数化示例，这里使用硬编码，实际应用中可以从配置文件或命令行参数获取
         *
         *
         *         try (FileOutputStream fos = new FileOutputStream(fileName);
         *              ObjectOutputStream oos = new ObjectOutputStream(fos)) {
         *             oos.writeObject(person);
         *             System.out.println("序列化成功");
         *         } catch (FileNotFoundException e) {
         *             // 文件不存在异常处理
         *             System.out.println("文件未找到：" + fileName);
         *         } catch (IOException e) {
         *             // IO异常处理
         *             System.out.println("写入文件时发生错误：" + fileName);
         *         } catch (Exception e) {
         *             // 其他异常处理
         *             System.out.println("发生意外错误：" + e.getMessage());
         *         }
         *     }
         * }
         */
    }
}
