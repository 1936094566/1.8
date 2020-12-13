package jucLearn;

/**
 * @description:
 * @auther 麻超
 * @date 2020/12/13
 */
public class VolatileDemo {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread td = new Thread(threadDemo);
        td.start();

        while(true){
            if(threadDemo.isFlag()){
                System.out.println("线程停止。。。。。。");
                break;
            }
        }
    }

}

class ThreadDemo implements Runnable{
    private volatile boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
            System.out.println("线程睡眠2s");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;



    }
}
