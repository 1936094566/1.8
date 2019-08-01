package stream;

import applelv3.Common;
import menu.Dish;

import java.util.List;

/**
 * @author machao
 * @date 2019/8/1
 * @time 14:04
 * @description
 **/
public class ReduceDemo2 {
    /**
     * 数数流中有多少菜
     * @param args
     */
    public static void main(String[] args) {
        List<Dish> dishes = Common.getDishes();
        Integer result = dishes.stream()
                .filter(s -> s.isVegetarian())
                .map(s -> 1).reduce(0, Integer::sum);
        System.out.println(result);
        //变形 map-reduce模式
        long count = dishes.stream().filter(s -> s.isVegetarian()).count();
        System.out.println(count);
    }
}
