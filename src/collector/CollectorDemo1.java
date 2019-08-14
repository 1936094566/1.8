package collector;

import applelv3.Common;
import menu.Dish;

import java.util.List;

/**
 * @author machao
 * @date 2019/8/14
 * @time 9:28
 * @description
 **/
public class CollectorDemo1 {
    public static void main(String[] args) {
        List<Dish> dishes = Common.getDishes();
        List<Dish> collect = dishes.stream().collect(new MyListCollector<>());
        System.out.println(collect);
    }
}

