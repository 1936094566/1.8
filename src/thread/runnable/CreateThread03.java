package thread.runnable;

/**
 * 匿名内部类创建线程
 */
public class CreateThread03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 50 ;i++ ){
                    System.out.println(Thread.currentThread().getName()+"   hello  ");
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 50 ;i++ ){
                    System.out.println(Thread.currentThread().getName()+"   hello  ");
                }
            }
        });
        thread.start();
        thread1.start();
    }

}
