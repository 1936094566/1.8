package thread;

public class CreateThread02 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"hello  ");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThread02());
        thread.start();
        for(int i=1;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"hello  ");
        }
    }
}
