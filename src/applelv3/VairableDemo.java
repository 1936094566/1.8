package applelv3;

/**
 * @author machao
 * @date 2019/7/18
 * @time 10:50
 * @description
 **/
public class VairableDemo {

    public static void main(String[] args) {
       final String str = "Hello World";
        Thread thread  = new Thread(()->{
            while(true){
                System.out.println(str);
            }
        });
        thread.start();
    }
}
