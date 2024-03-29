package Thread;

import static java.lang.Thread.*;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t2.start();
        //Thread.sleep(1000);
        t1.start();

    }


}
class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("线程1："+i);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("线程2："+i);
        }
    }
}
