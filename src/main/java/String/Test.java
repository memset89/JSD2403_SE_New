package String;

/**
 * 实现域名截取
 */
public class Test {
    public static void main(String[] args) {
        String s1="www.github.com/memset89/JSD2403_SE_New/tree/511efb6cc811fd20f12ffc56bae589ddecc9db7b";
        String s2="doc.codeboy.com";
        String name1=getHostName(s1);
        String name2=getHostName(s2);
        System.out.println(name1);
        System.out.println(name2);
    }
    public static String getHostName(String line){
        int x=line.indexOf(".");
        int y=line.indexOf(".",(x+1));
        String m=line.substring(x+1,y);
        return m;
    }
}

