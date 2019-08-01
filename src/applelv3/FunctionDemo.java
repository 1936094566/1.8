package applelv3;

import applev1.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author machao
 * @date 2019/7/18
 * @time 10:22
 * @description
 **/
public class FunctionDemo {
    public static void main(String[] args) {
        List<Apple> apples = Common.apples;


//        List<String> name = getName(apples, (Apple apple) -> apple.getName());
//        System.out.println(name);
    }

    public  static <T,S> List<S> getName(List<T> lists, Function<T,S> function){
        List<S> returnData = new ArrayList<>();
        for (T t :lists){
            returnData.add(function.apply(t));
        }
        return  returnData;
    }
}
