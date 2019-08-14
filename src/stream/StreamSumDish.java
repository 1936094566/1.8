package stream;

import applelv3.Common;
import menu.Dish;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/8/13
 * @time 16:33
 * @description
 **/
public class StreamSumDish {
    public static void main(String[] args) {
        List<Dish> dishes = Common.getDishes();
        Integer collect = dishes.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(collect);
        //得到所有数字
        IntSummaryStatistics collect1 = dishes.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(collect1);
        //得到所以菜单的热量
        Integer collect2 = dishes.stream().collect(Collectors.reducing(0, Dish::getCalories, (x, y) -> x + y));
        System.out.println(collect2);
    }
}
