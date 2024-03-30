package Threadtest;

public class SyncDemo2 {
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        Thread t1 = new Thread("范传奇"){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread("王克晶"){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }

}
class Shop
{
    public void buy(){
        try {
            Thread t = Thread.currentThread();//获取调用buy方法的线程
            String name = t.getName();//获取线程名字
            System.out.println(name+":正在挑衣服...");
            Thread.sleep(5000);
            synchronized (this){
            System.out.println(name+":正在试衣服...");
            Thread.sleep(5000);
            }
            System.out.println(name+":结账离开");
        } catch (InterruptedException e) {
        }
    }
}