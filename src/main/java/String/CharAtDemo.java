package String;
public class CharAtDemo {
    public static void main(String[] args) {
        String line="www.tedu.cn";
        char c=line.charAt(4);
        System.out.println(c);

        //将每一个字符输出
        for (int i=0;i<line.length();i++){
            c=line.charAt(i);
            System.out.println(c);
        }
        String ro="上海自来水火水来自海上";
        for (int i=0;i<=ro.length()/2;i++){
            if (ro.charAt(i)!=ro.charAt(ro.length()-1-i)){
                System.out.println("不是回文");
                break;
            }
            if (i==ro.length()/2){
                System.out.println("是回文");
            }
        }

    }
}
