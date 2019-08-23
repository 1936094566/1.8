package thread;

/**
 * @author machao
 * @date 2019/8/23
 * @time 10:48
 * @description  创建线程
 **/
public class TryConcurrency {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    readFormDataBase();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    writeFile();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t.start();
    }

    public static void readFormDataBase() throws InterruptedException {
        print("begin read data from db");
        Thread.sleep(10000L);
        print("read data done and start handle it.");
        print("read data finish");
    }
    public static void writeFile() throws InterruptedException {
        print("begin write file from db");
        Thread.sleep(10000L);
        print("write file done and start handle it.");
        print("write file finish");
    }
    private static void print(String message){
        System.out.println(message);
    }
}
