package thread.runnable;


/**
 * @author machao
 * @date 2019/8/27
 * @time 10:41
 * @description
 **/
public class Jvm {

    public static void main(String[] args) {
            System.out.println(TestA.str);
    }
}
class TestA{
    public static  String str = "Hello World";

    static{
        System.out.println("TestA");
    }
}
