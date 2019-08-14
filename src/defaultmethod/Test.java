package defaultmethod;

/**
 * @author machao
 * @date 2019/8/14
 * @time 11:25
 * @description
 **/
public class Test {
    public static void main(String[] args) {
        Function function = new FunctionImpl2();
        function.function3();
        Function function1 = new FunctionImpl();
        function1.function3();
    }
}
