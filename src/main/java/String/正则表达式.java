package String;

public class 正则表达式 {
    /**
     * []表示一个字符
     * [abc]表示abc其中之一
     * [a-z]任意小写字母
     * [a-zA-Z0-9]a-zA-Z0-9中的任意一个字符
     * [^abc]除了abc
     * [^a-zA-Z0-9]除了a-zA-Z0-9
     * [^a-zA-Z0-9_]除了a-zA-Z0-9_
     * [^a-zA-Z0-9_@]除了a-zA-Z0-9_@
     * \d表示数字
     * \D 非数字
     * .任意一个字符
     * \w 数字字母下划线（java命名规则）
     * \W 非数字字母下划线
     * \s 空白字符
     * \S 非空白字符
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        String email = "123@qq.com";
        String email2 = "123@123";
        String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean matches = email.matches(regex);
        boolean matches2 = email2.matches(regex);
        System.out.println(matches?"合法":"不合法");
        System.out.println(matches2?"合法":"不合法");
    }

}
