package thread;

class CreateThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " thread  run .... ");
        }
    }
}


public class ThreadDemo01 {
    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        //启动线程用start 不会用run
        createThread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " thread  run ... ");
        }
    }
}
