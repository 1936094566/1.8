package thread;

/**
 * @author machao
 * @date 2019/8/23
 * @time 13:51
 * @description
 **/
public class TicketWindow extends Thread {
    private final String name;
    private static final int max = 50;
    private static int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= max) {
            System.out.println(name + "窗口:" + index + "号");
            index++;
        }
    }

    public static void main(String[] args) {
        TicketWindow tk = new TicketWindow("1号");
        tk.start();
        TicketWindow tk2 = new TicketWindow("2号");
        tk2.start();
        TicketWindow tk3 = new TicketWindow("3号");
        tk3.start();
    }
}
