package Threadtest;

public class ThreadDemo3 {
    public static void main(String[] args) {
        //继承Thread重写run方法的形式
        Thread t1 = new Thread(){
            public void run()
            {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程1："+i);
                }
            }
        };

        //实现Runnable接口重写run方法的形式
//        Runnable t2= new Runnable() {
//            public void run()
//            {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println("线程2："+i);
//                }
//            }
//        };
        Runnable t2= ()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("线程2："+i);
            }
        };
        Runnable t3=()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("线程3："+i);
            }
        };
        Thread t4=new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("线程4："+i);
            }
        });

        t1.start();
        new Thread(t2).start();
        new Thread(t3).start();
        t4.start();
    }
}
