package thread.runnable;

/**
 * @author machao
 * @date 2019/8/23
 * @time 14:02
 * @description
 **/
public class TicketWindowRunnable implements Runnable {
    private static final int max = 50;

    private static int index = 1;


    @Override
    public void run() {
        while (index <= max) {
            System.out.println(Thread.currentThread()+"窗口:"+index+"号");
            index++;
        }
    }
}
