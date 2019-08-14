package future;


import java.util.concurrent.*;

/**
 * @author machao
 * @date 2019/8/14
 * @time 15:34
 * @description
 **/
public class FutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<?> doIt = executorService.submit(() -> {
            long  index=0;
            while(true){
               
                if(index<900000000){
                    System.out.println("这里是异步执行");
                }
                index++;
            }
        });
        System.out.println("硕士生");
        try {
            doIt.get(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("出现了异常");
        } catch (ExecutionException e) {
            System.out.println("当前线程等待中,被中断");
        } catch (TimeoutException e) {
            System.out.println("线程超时...");
            boolean cancel = doIt.cancel(false);
        }
        System.out.println("张三");
    }
}
