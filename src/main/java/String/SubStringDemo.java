package String;

public class SubStringDemo {
    public static void main(String[] args) {
        String x="sakhxahgxbahxvh  gasvhjga  s";
        String y=x.substring(4,8);//截取4-8位
        System.out.println(y);
        y=x.substring(4);//从第四位开始截取
        System.out.println(y);
    }
}
