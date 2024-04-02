package Threadtest;

public class SyncDemo6 {
    public static void main(String[] args) {
        //演示一下互斥
        Foo f=new Foo();
        Thread t1=new Thread(f::method1);
        Thread t2=new Thread(f::method2);
        t1.start();
        t2.start();
    }
}
class Foo{
    public synchronized void method1(){
        try {
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"正在执行A");

            Thread.sleep(5000);
            System.out.println(t.getName()+"执行A完毕");
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
    }
    public synchronized void method2(){
        try {
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"正在执行B");

            Thread.sleep(5000);
            System.out.println(t.getName()+"执行B完毕");
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
    }
}

