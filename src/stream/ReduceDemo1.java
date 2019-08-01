package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author machao
 * @date 2019/8/1
 * @time 13:59
 * @description
 **/
public class ReduceDemo1 {
    /**
     * 规约2:最大最小值
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,3,9);
        Integer maxResult = nums.stream().reduce(Integer::max).get();
        System.out.println(maxResult);
    }
}
