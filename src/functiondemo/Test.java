package functiondemo;

/**
 * @author machao
 * @date 2019/7/19
 * @time 15:56
 * @description
 **/
public class Test {
    public static Integer num = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                addNum();
            }
        }).start();


        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                addNum();
            }
        }).start();

    }

    public synchronized  static void addNum() {
        num++;
        System.out.println("线程"+Thread.currentThread().getName()+",当前数字值"+num);
    }

}
