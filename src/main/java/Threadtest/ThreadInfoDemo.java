package Threadtest;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("运行INFO的线程是： " + t);
        System.out.println("主线程优先级 " + t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("主线程优先级 " + t.getPriority());
        System.out.println("主线程是否是守护线程 " + t.isDaemon());
        System.out.println("是否活着"+t.isAlive());
        System.out.println("是否被中断"+t.isInterrupted());
        //t.setDaemon(true);
        //System.out.println("主线程是否是守护线程 " + t.isDaemon());
        t.setName("主线程");
        System.out.println("主线程名称 " + t.getName());
        System.out.println("ID:"+t.getId());
    }
}
