package applelv3;

import applev1.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author machao
 * @date 2019/7/18
 * @time 9:55
 * @description
 **/
public class PerdefinInterface {

    public static List<Apple> apples;

    static {
        apples = new ArrayList<>();
        apples.add(new Apple("Green", 60));
        apples.add(new Apple("Red", 180));
        apples.add(new Apple("Green", 160));
        apples.add(new Apple("Green", 70));
        apples.add(new Apple("Red", 50));

    }
    public static void main(String[] args) {
        List<Apple> apples3 = getApples(apples, (Apple apple) -> apple.getWeight() > 100 && "red".equalsIgnoreCase(apple.getName()));
        System.out.println(apples3);
        System.out.println("#####################################################");
        //#####################################################
        Consumer<Apple> customer = (Apple apple) -> apple.setName("红黑求");
        List<Apple> apples1 = getApples(apples, customer);
        System.out.println(apples1);
        System.out.println("#####################################################");
        List<Apple> apples2 = getApples(apples, (Apple apple) -> apple.setWeight(990));
        System.out.println(apples2);
        System.out.println("#####################################################");
    }
    public static <T> List<T> getApples(List<T> lists, Predicate<T> predicate){
        List<T> returnData = new ArrayList<>();
        for(T t : lists){
            if (predicate.test(t)){
                returnData.add(t);
            }
        }
        return returnData;
    }
    public static <T> List<T> getApples(List<T> lists, Consumer<T> consumer){
        for(T t : lists){
            consumer.accept(t);
        }
        return lists;
    }

}
