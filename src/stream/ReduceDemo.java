package stream;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author machao
 * @date 2019/8/1
 * @time 13:42
 * @description
 **/
public class ReduceDemo {
    /**
     * 规约(求和,求积)
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2);
        Integer sumResult = nums.stream().reduce(0, (a, b) -> a + b);
        //同↓
        Integer sumResult1 = nums.stream().reduce(0, Integer::sum);
        //继续变
        nums.stream().reduce(Integer::sum).ifPresent(s->System.out.println(s));
        //这样也行
        nums.stream().reduce((a,b)->a+b).ifPresent(s->System.out.println(s));
        System.out.println(sumResult);
        System.out.println(sumResult1);
        Integer avgResult = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println(avgResult);
    }
}
