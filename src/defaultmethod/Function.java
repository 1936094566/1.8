package defaultmethod;

/**
 * @author machao
 * @date 2019/8/14
 * @time 11:22
 * @description
 **/
public interface Function {

    void function1();
    void function2();
    default  void function3(){
        System.out.println("function do function3");
    }
    default  void function4(){
        System.out.println("function do function4");
    }
}
