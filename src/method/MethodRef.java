package method;

import applelv3.Common;
import applev1.Apple;
import javafx.util.Builder;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * @author machao
 * @date 2019/7/18
 * @time 10:56
 * @description 方法引用
 **/
public class MethodRef {
    public static void main(String[] args) {
        List<Apple> apples = Common.apples;
        apples.sort(Comparator.comparing(Apple::getWeight).reversed());

        //new一个Apple对象
        Supplier<Apple> supplier = Apple::new;
        Apple apple = supplier.get();
        Supplier<Apple> supplier1 = () -> new Apple();

        BiFunction<String, Integer, Apple> runnable = Apple::new;
        Apple apply = runnable.apply("Red", 150);
    }
}
