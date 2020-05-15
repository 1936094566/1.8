package thread;


public class ThreadJoinDemo {
    public static void main(String[] args) {
       Thread t1 = new Thread(()->{
           for (int i =0;i<50;i++){
                System.out.println(Thread.currentThread().getName()+"=====> "+i);
           }
       });
        Thread t2 = new Thread(()->{
            try {
                t1.join();
            } catch (InterruptedException e) {
            }
            for (int i =0;i<50;i++){
                System.out.println(Thread.currentThread().getName()+"=====> "+i);
            }
        });
        Thread t3 = new Thread(()->{
            try {
                t2.join();
            } catch (InterruptedException e) {
            }
            for (int i =0;i<50;i++){
                System.out.println(Thread.currentThread().getName()+"=====> "+i);
            }
        });
       try{
           t1.start();
           t2.start();
           t3.start();

       }catch (Exception ex){
           ex.printStackTrace();
       }

    }
}
