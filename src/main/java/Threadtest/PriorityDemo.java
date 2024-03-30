package Threadtest;

public class PriorityDemo {
    public static void main(String[] args)
    {
        Thread min = new Thread(){
            public void run()
            {
                for (int i=1;i<100000;i++){
                    System.out.println("min"+"第"+i+"次");
                }
            }
        };
        Thread max = new Thread(){
            public void run()
            {
                for (int i=1;i<100000;i++){
                    System.out.println("max"+"第"+i+"次");
                }
            }
        };
        Thread nor = new Thread(){
            public void run()
            {
                for (int i=1;i<100000;i++){
                    System.out.println("mor"+"第"+i+"次");
                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        nor.setPriority(Thread.NORM_PRIORITY);
        min.start();
        max.start();
        nor.start();
    }


}
