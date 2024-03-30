package Threadtest;
//import java.Thread
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        for (int i = 10; i >= 0; i--) {
            System.out.println("还剩" + i + "秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BOW!!");
    }
}
