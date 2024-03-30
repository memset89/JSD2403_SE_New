package Threadtest;

public class SyncDemo4 {
    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder();
        // StringBuffer是线程安全的
        //StringBuilder是线程不安全的
        StringBuffer sb = new StringBuffer();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sb.append("abc");
                //System.out.println(sb);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sb.append("def");
                //System.out.println(sb);
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
