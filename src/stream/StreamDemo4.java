package stream;


import applelv3.Common;
import menu.Dish;

import java.util.List;

/**
 * @author machao
 * @date 2019/8/1
 * @time 10:44
 * @description
 **/
public class StreamDemo4 {
    public static void main(String[] args) {
        //findAny和findFirst一样只会返回一个对象
        List<Dish> dishes = Common.getDishes();
        dishes.stream()
                .filter(s->s.getCalories()>300)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));
    }
}
