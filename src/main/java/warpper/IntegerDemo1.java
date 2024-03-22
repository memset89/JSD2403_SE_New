package warpper;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //基本类型转换为包装类
        int a = 128;//127到-128
//        Integer i1 = new Integer(a);
//        Integer i2 = new Integer(a);
        //java推荐将基本类型转换为包装类时,使用包装类的valueOf方法
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(a);

        System.out.println("i1:"+i1);
        System.out.println("i2:"+i2);
        System.out.println(i1==i2);//true
        System.out.println(i1.equals(i2));//true

        double dou = 3.14;
        Double d1 = Double.valueOf(dou);
        Double d2 = Double.valueOf(dou);
        System.out.println(d1==d2);//false
        System.out.println(d1.equals(d2));//true


//        包装类转换为基本类型
        int i = i1.intValue();
        System.out.println(i);
        long l = i1.longValue();
        System.out.println(l);//long l = 128;
        byte b = i1.byteValue();//注意溢出问题
        System.out.println(b);//-128

        i = d1.intValue();//double转换为int会丢失精度
        System.out.println(i);

    }
    /**
     * 包装类（Wrapper Classes）在Java编程语言中，是指为了解决基本数据类型（如int、double、boolean等）不能直接作为对象参与操作的局限性而设计的一组类。每个基本数据类型都有对应的包装类，这些类位于java.lang包下，并且都是不可变的。
     * 包装类与基本数据类型的对应关系如下：
     * Integer 对应 int
     * Double 对应 double
     * Boolean 对应 boolean
     * Character 对应 char
     * Byte 对应 byte
     * Short 对应 short
     * Long 对应 long
     * Float 对应 float
     * 包装类的主要作用包括但不限于：
     * 对象化：将基本数据类型转换成对象，以便它们可以用于需要对象参数的方法调用或者存储在集合框架（如ArrayList、HashMap）中。
     * 方法丰富：提供了一系列的方法和属性，比如获取最大值、最小值、字符串与基本类型的相互转换、进制转换等。
     * 泛型支持：Java泛型要求所有元素必须是对象，因此在使用泛型时，基本数据类型需要先转换为其对应的包装类。
     * 自动装箱/拆箱：Java SE 5引入了自动装箱和拆箱的概念，使得编译器能够自动在基本类型和它们的包装类之间进行转换。
     * 例如，Integer 类提供了 parseInt() 方法从字符串解析整数，以及 valueOf() 方法将 int 值转换为 Integer 对象。同时，通过自动装箱，可以直接将 int 类型变量传给需要 Integer 参数的方法，反之亦然，这是通过自动拆箱实现的
     */
}
