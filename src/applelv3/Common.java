package applelv3;

import applev1.Apple;
import menu.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author machao
 * @date 2019/7/18
 * @time 10:12
 * @description
 **/
public class Common {

    public static List<Apple> apples;

    static {
        apples = new ArrayList<>();
        apples.add(new Apple("Green", 60));
        apples.add(new Apple("Red", 180));
        apples.add(new Apple("Green", 160));
        apples.add(new Apple("Green", 70));
        apples.add(new Apple("Red", 50));

    }
    public static List<Apple> getApples(){
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("Blue", 60));
        list.add(new Apple("Red", 180));
        list.add(new Apple("Yellow", 160));
        list.add(new Apple("Green", 70));
        list.add(new Apple("Red", 70));
        return list;
    }
    public static List<Dish> getDishes(){
        return Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));
    }
    public static List<Transaction> getTransaction(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    public static void delay(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
