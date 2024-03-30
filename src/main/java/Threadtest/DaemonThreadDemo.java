package Threadtest;

public class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread rose = new Thread(() -> {
            for(int i = 0;i < 10; i++){
                System.out.println("Rose:Let me Go!");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Rose:噗通。。。。。咕噜咕噜。。。。嘎");
        });
        Thread jack = new Thread(() -> {
            while (true){
                System.out.println("Jack:You Jump, I Jump!");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        rose.start();
        jack.setDaemon(true);
        jack.start();
        while (true);
    }
}
