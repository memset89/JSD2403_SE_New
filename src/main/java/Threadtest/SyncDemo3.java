package Threadtest;

public class SyncDemo3 {
    public static void main(String[] args) {
        //Boo b2=new Boo();
        //Boo b1=new Boo();
        Thread t1=new Thread(){
            public void run(){
                Boo.doSome();
            }
        };
        t1.start();
        //Runnable r=()->b2.doSome();
        Thread t2=new Thread(()->Boo.doSome());
        t2.start();
    }
}
class Boo {

    public static void doSome() {
        synchronized (Boo.class){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "开始执行doSome方法");
            Thread.sleep(5000);
            System.out.println(t.getName() + "执行doSome方法结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    }
}
