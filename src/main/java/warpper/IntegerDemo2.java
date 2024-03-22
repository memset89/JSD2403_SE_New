package warpper;

public class IntegerDemo2 {
    //所有数字类型的包装类都包含两个常量：MAX_VALUE和MIN_VALUE
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println(imax);
        System.out.println(imin);
        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println(dmax);
        System.out.println(dmin);
        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(lmax);
        System.out.println(lmin);

        //包装类可以将字符串转换为对应的基本类型
        String str = "123.123";

        try {
            // 尝试将字符串解析为双精度浮点型，这样可以保留小数部分
            double doubleValue = Double.parseDouble(str);

            // 再将双精度浮点型转换为整数，这里采用向下取整的方式
            // 这样做是为了避免数据的丢失，例如"123.456"会转换为"123"
            int intValue = (int) doubleValue;

            // 输出转换结果，你可以根据实际情况将其用于其他逻辑处理
            System.out.println("转换后的整数值为：" + intValue);
        } catch (NumberFormatException e) {
            // 当输入的字符串无法解析为数字时，捕获此异常
            System.out.println("无法将输入的字符串转换为整数，请确保输入是正确的数字格式。");
        }

        //前提：该字符串正确描述了基本类型可以保存的值，否则会抛出异常

        double d = Double.parseDouble(str);//把字符串转换为基本类型
        System.out.println(d);


    }
}
