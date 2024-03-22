package String;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderDemoTest {

    @Test
    public void testStringBuilderDemo() {
        // 创建一个StringBuilder对象B，并初始化为"好好学JAVA"
        StringBuilder B = new StringBuilder("好好学JAVA");
        // 在末尾追加字符串"为了找个工作"
        B.append("为了找个工作");
        // 打印B当前包含的字符串
        assertEquals("好好学JAVA为了找个工作", B.toString());

        // 将字符串中的第7到13个字符替换为"为了改变世界"
        B.replace(7, 13, "为了改变世界");
        // 打印替换后的字符串
        assertEquals("好好学为了改变世界", B.toString());

        // 删除字符串中的第7到13个字符
        B.delete(7, 13);
        // 打印删除后的字符串
        assertEquals("好好学", B.toString());

        // 将字符串B逆转
        B.reverse();
        // 打印逆转后的字符串
        assertEquals("JAVA学好", B.toString());

        // 在字符串的第7个位置插入"为了改变世界"
        B.insert(7, "为了改变世界");
        // 打印插入后的字符串
        assertEquals("JAVA学好为了改变世界", B.toString());

        // 打印字符串B的长度
        assertEquals(17, B.length());

        // 删除B的最后一位字符
        B.deleteCharAt(B.length() - 1);
        // 再次删除B的最后一位字符
        B.deleteCharAt(B.length() - 1);
        assertEquals("JAVA学好为了改", B.toString());
    }
}
