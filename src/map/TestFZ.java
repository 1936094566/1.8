package map;

import java.util.concurrent.*;

/**
 * @author machao
 * @date 2019/8/21
 * @time 11:00
 * @description
 **/
public class TestFZ {
    static Z z = new Z();

    private static ExecutorService executor = new ThreadPoolExecutor(10, 10,
            60L, TimeUnit.SECONDS,
            new ArrayBlockingQueue(10));
    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executor.execute(new SetValue());
        }

    }

   static  class SetValue extends Thread{
        @Override
        public void run() {
            z.setMap(Thread.currentThread().getName());
            System.out.println(z.map);
        }
    }
}
