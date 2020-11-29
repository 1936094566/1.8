package jucLearn;

import sun.misc.PostVMInitHook;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @auther 麻超
 * @date 2020/11/29
 */
class Ticket {
    private int number = 3000;
    Lock lock = new ReentrantLock();
    /**
     * synchronized 重锁
     */
    public void sale() {
        lock.lock();
        try{
            if(number > 0){
                System.out.println(Thread.currentThread().getName()+"\t卖出第:"+(number -- )+"还剩下"+number);
            }
        }finally {
            lock.unlock();
        }

    }

}

public class SaleTicketDemo {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i <40 ; i++) {
                ticket.sale();
            }
        }, "售票员A").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "售票员B").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "售票员C").start();

    }



}

