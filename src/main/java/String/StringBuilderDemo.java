package String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // 创建一个StringBuilder对象B，并初始化为"好好学JAVA"
        StringBuilder B = new StringBuilder("好好学JAVA");
        // 在末尾追加字符串"为了找个工作"
        B.append("为了找个工作");
        // 打印B当前包含的字符串
        System.out.println(B);
        // 将字符串中的第7到13个字符替换为"为了改变世界"
        B.replace(7, 13, "为了改变世界");
        // 打印替换后的字符串
        System.out.println(B);
        // 删除字符串中的第7到13个字符
        B.delete(7, 13);
        // 打印删除后的字符串
        System.out.println(B);
        // 将字符串B逆转
        B.reverse();
        // 打印逆转后的字符串
        System.out.println(B);
        // 在字符串的第7个位置插入"为了改变世界"
        B.insert(7, "为了改变世界");
        // 打印插入后的字符串
        System.out.println(B);
        // 打印字符串B的长度
        System.out.println(B.length());
        // 删除B的最后一位字符
        B.deleteCharAt(B.length() - 1);
        // 再次删除B的最后一位字符
        B.deleteCharAt(B.length() - 1)
        .deleteCharAt(B.length() - 1);

        // 打印删除后的字符串
        System.out.println(B);
        System.out.println(B.capacity());
        System.out.println(B.length());
        System.out.println(B.toString());
        System.out.println(B.indexOf("好"));
        System.out.println(B.indexOf("好", 2));
        System.out.println(B.indexOf("好", 3));
        System.out.println(B.indexOf("好", 4));



    }
}
