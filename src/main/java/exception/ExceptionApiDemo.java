package exception;

public class ExceptionApiDemo {
    public static void main(String[] args)
    {
        System.out.println("程序开始");
        try {
            String line="8nsdc4";
            System.out.println(Integer.parseInt(line));
        }catch(Exception e){
            e.printStackTrace();
            String message=e.getMessage();
            System.out.println(message);
        }
        System.out.println("程序错误了");
    }
}
