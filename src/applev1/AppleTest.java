package applev1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author machao
 * @date 2019/7/17
 * @time 16:40
 * @description
 **/
public class AppleTest {

    public  static List<Apple> apples ;
    static {
        apples = new ArrayList<>();
        apples.add(new Apple("Green",60));
        apples.add(new Apple("Red",180));
        apples.add(new Apple("Green",160));
        apples.add(new Apple("Green",70));
        apples.add(new Apple("Red",50));

    }

    public static void main(String[] args) {
        //prettyPrintApple(apples,new WeightFilter());
        //输出小于60的苹果颜色

/*
        prettyPrintApple(apples, new Filter<Apple>() {

            @Override
            public boolean test(Apple obj) {
                return obj.getWeight()<60;
            }
        });*/
        //Lambda 表达式
        prettyPrintApple(apples,(Apple apple)->"Red".equals(apple.getName()));

    }

    public static void prettyPrintApple(List<Apple> apples,Filter filter){
        for (Apple apple:apples){
            if(filter.test(apple)){
                System.out.println(apple);
            }
        }
    }

}
