package stream;

import applelv3.Common;
import menu.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author machao
 * @date 2019/7/31
 * @time 18:17
 * @description
 **/
public class StreamController {
    public static void main(String[] args) {
//        List<String> title = Arrays.asList("Java8", "In", "Action");
//        Stream<String> s = title.stream();
//        //流跟迭代器一样只能操作一次
//        s.forEach(System.out::println);
//        s.forEach(System.out::println);
        List<Dish> dishes = Common.getDishes();
        List<String> collect = dishes.stream().filter(s -> {
            System.out.println("filtering >>> " + s.getName());
            return s.getCalories() > 300;
        }).map(d -> {
            System.out.println("mapping === " + d.getName());
            return d.getName();
        }).limit(3).collect(Collectors.toList());
        System.out.println(collect);
    }
}
