package stream;

import applelv3.Common;
import menu.Dish;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/8/13
 * @time 16:46
 * @description 分组
 **/
public class StreamGroup {
    public static void main(String[] args) {
        List<Dish> dishes = Common.getDishes();
        Map<Dish.Type, List<Dish>> collect = dishes.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect);
        //自定义分组
        Map<String, List<Dish>> collect1 = dishes.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return "低热量";
            } else if (dish.getCalories() <= 700) {
                return "中级热量";
            } else {
                return "高级热量";
            }
        }));
        System.out.println(collect1);
        //二级分组器
        Map<String, Map<Dish.Type, List<Dish>>> collect2 = dishes.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return "低热量";
            } else if (dish.getCalories() <= 700) {
                return "中级热量";
            } else {
                return "高级热量";
            }
        }, Collectors.groupingBy(Dish::getType)));

        System.out.println(collect2);
        //二级分组器plus,第二个参数可以传递任何收集器
        Map<String, Long> collect3 = dishes.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return "低热量";
            } else if (dish.getCalories() <= 700) {
                return "中级热量";
            } else {
                return "高级热量";
            }
        }, Collectors.counting()));
    }
}
