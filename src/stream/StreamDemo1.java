package stream;

import applelv3.Common;
import menu.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/7/31
 * @time 18:31
 * @description
 **/
public class StreamDemo1 {
    public static void main(String[] args) {
        List<Dish> dishes = Common.getDishes();
        List<Dish> dish = dishes.stream()
                .filter(s -> s.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(dish);
        List<Dish> collect = dishes.stream()
                .filter(s -> s.getType().equals(Dish.Type.MEAT))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
