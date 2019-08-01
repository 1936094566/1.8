package method;
import java.util.function.Function;

/**
 * @author machao
 * @date 2019/7/19
 * @time 9:06
 * @description
 **/
public class SvgFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> function = x-> x +1;

        Function<Integer,Integer> function1 = x-> x *3;


        Integer result = function.apply(2);
        //a.compose(b)先运算出b的值,在运算a的值
        Function<Integer, Integer> compose = function.compose(function1);

        /**
         * 例a.andThen(b) 先运算出A的值,在运算B的值
         */
        Function<Integer, Integer> doIt = function.andThen(function1);

        System.out.println(result);
        System.out.println(compose.apply(2));
        System.out.println(doIt.apply(2));

    }
}
