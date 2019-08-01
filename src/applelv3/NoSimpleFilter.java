package applelv3;

import applev1.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author machao
 * @date 2019/7/18
 * @time 16:48
 * @description
 **/
public class NoSimpleFilter {
    public static void main(String[] args) {
        List<Apple> apples = Common.getApples();
        //过滤出红色
       Predicate<Apple> redFilter = (Apple apple) -> "Red".equals(apple.getName());
        Predicate<Apple>  noRedFilter = redFilter.negate();
        Predicate<Apple> smallRedApple = noRedFilter.and(apple -> apple.getWeight() < 80);
       List<Apple> obj = getObj(apples, smallRedApple);
        System.out.println(obj);

    }
    public static <T> List<T> getObj(List<T> ts ,Predicate<T> filter){
        List<T> list = new ArrayList<>();
        for (T t: ts){
            if(filter.test(t)){
                list.add(t);
            }
        }
        return list;
    }


}
