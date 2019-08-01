package stream;

import applelv3.Common;
import menu.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author machao
 * @date 2019/8/1
 * @time 9:09
 * @description
 **/
public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> collect = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collect);
        //获取菜单的名字有多长
        List<Dish> dishes = Common.getDishes();
        List<Integer> collect1 = dishes.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
        System.out.println(collect1);
        //给一个集合字母去重
        List<String> distinctList = Arrays.asList("Hello", "World");
        List<String> collect2 = distinctList.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(collect2);
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect3 = nums.stream().map(s -> s * s).collect(Collectors.toList());
        System.out.println(collect3);
        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(3, 4);
        List<int[]> collect4 = nums1.stream().flatMap(i -> nums2.stream().map(j -> new int[]{i, j})).collect(Collectors.toList());
        // collect4.stream().forEach(s ->System.out.println(Arrays.toString(s)));
        List<int[]> collect5 = nums1.stream()
                .flatMap(i -> nums2.stream()
                        .filter(s -> (s + i) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        collect5.stream().forEach(s -> System.out.println(Arrays.toString(s)));

    }
}
