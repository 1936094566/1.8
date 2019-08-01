package method;

import applelv3.Common;
import applev1.Apple;

import java.util.Comparator;
import java.util.List;

/**
 * @author machao
 * @date 2019/7/18
 * @time 16:28
 * @description
 **/
public class AppleSort {
    public static void main(String[] args) {
        List<Apple> apples = Common.getApples();
        apples.sort((Apple a1,Apple a2) -> a2.getWeight()-a1.getWeight());
        System.out.println(apples);

        List<Apple> apples1 = Common.getApples();
        apples1.sort((a1,a2)->a2.getWeight().compareTo(a1.getWeight()));
        System.out.println(apples1);

        List<Apple> apples2 = Common.getApples();
        apples2.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(apples2);

        List<Apple> apples3 = Common.getApples();
        apples3.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getName));
        System.out.println(apples3);



    }
}
