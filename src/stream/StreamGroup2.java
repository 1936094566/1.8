package stream;

import applelv3.Common;
import menu.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/8/13
 * @time 17:04
 * @description 把收集器的结果转换成其他类型
 **/
public class StreamGroup2 {
    public static void main(String[] args) {
        List<Dish> dishes = Common.getDishes();
        //这里返回Optional 是错误类型
        Map<Dish.Type, Optional<Dish>> collect = dishes.stream().collect(Collectors.groupingBy(Dish::getType,
                Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
        //正确写法
        Map<Dish.Type, Dish> result = dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get
        )));
        System.out.println(result);
    }
}
