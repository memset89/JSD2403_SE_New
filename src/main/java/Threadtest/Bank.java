package Threadtest;

public class Bank {
    private int account = 20000;

//    public boolean drawMoney(int drawMoney){
//        if(money >= drawMoney){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            money -= drawMoney;
//            System.out.println(Thread.currentThread().getName() + "取钱成功，余额为：" + money);
//            return true;
//        }else{
//            System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足");
//            return false;
//        }
//
//    }
//synchronized 锁对象 同步方法 当一个对象被锁定时，其他线程只能等待，直到该对象被解锁。 不能同时运行
    public synchronized boolean getMoney(int money){
        int sum=getAccount();
        if(sum>=money){

            sum -= money;
            Thread.yield();
            saveMoney(sum);
            return true;
        }else{
            return false;
        }
    }
    public int getAccount(){
        return account;
    }
    public int saveMoney(int money){
        return account = money;
    }


}
