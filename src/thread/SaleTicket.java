package thread;

/**
 * @Created with IDEA
 * @author:麻超
 * @Date:2019/9/13
 * @Time:14:12
 **/
public class SaleTicket extends Thread {
    public static Integer tickets = 10000;

    public SaleTicket(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (tickets >0) {
            saleTicket();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }

    }

    public static void saleTicket() {
        synchronized (SaleTicket.class) {
            if(tickets>0){
                System.out.println(Thread.currentThread().getName() + "窗口,售出第" + tickets-- + "号票");
            }
        }
    }

    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket("一号");
        SaleTicket saleTicket1 = new SaleTicket("二号");
        SaleTicket saleTicket2 = new SaleTicket("三号");
        saleTicket.start();
        saleTicket2.start();
        saleTicket1.start();
    }
}


