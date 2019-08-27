package thread.runnable;

import java.util.LinkedList;

/**
 * @author machao
 * @date 2019/8/23
 * @time 14:03
 * @description
 **/
public class Bank {
    public static void main(String[] args) {
//        final TicketWindowRunnable twr = new TicketWindowRunnable();
//        Thread thread1 = new Thread(twr,"1号");
//        Thread thread2 = new Thread(twr,"2号");
//        Thread thread3 = new Thread(twr,"3号");
//        thread1.start();
//        thread2.start();
//        thread3.start();

        LinkedList<String> list = new LinkedList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add(2,"wxs");
        System.out.println(list);


    }
}
