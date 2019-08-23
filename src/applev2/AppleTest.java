package applev2;

import applev1.Apple;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author machao
 * @date 2019/7/17
 * @time 16:40
 * @description
 **/
public class AppleTest {

    public static List<Apple> apples;
    public static final String filePath = "C:\\Users\\mc\\Desktop\\slapd.conf.default";

    static {
        apples = new ArrayList<>();
        apples.add(new Apple("Green", 60));
        apples.add(new Apple("Red", 180));
        apples.add(new Apple("Green", 160));
        apples.add(new Apple("Green", 70));
        apples.add(new Apple("Red", 50));

    }

    public static void main(String[] args) throws IOException {
        //prettyPrintApple(apples,new WeightFilter());
        //输出小于60的苹果颜色

/*
        prettyPrintApple(apples, new Filter<Apple>() {

            @Override
            public boolean test(Apple obj) {
                return obj.getWeight()<60;
            }
        });*/

        List<Integer> numbers = Arrays.asList(1, 2, 34, 5);

        //Lambda 表达式
        prettyPrintApple(apples, (Apple apple) -> "Red".equals(apple.getName()));

        prettyPrintApple(numbers, (Integer abc) -> 1 == abc);

        apples.sort((Apple apple1, Apple apple2) -> apple2.getWeight().compareTo(apple1.getWeight()));

     /*   thread t = new thread(()->System.out.println("HELLO WORLD"));
        t.start();*/

        process(() -> System.out.println("hello"));
        String str = processFile((BufferedReader buffered) -> buffered.readLine()+buffered.readLine());
        System.out.println(str);

    }

    public static String processFile(BufferReaderUtil bufferReaderUtil) throws IOException {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
           return  bufferReaderUtil.read(bufferedReader);
        }catch(Exception ex){
            return "";
        }finally {
            bufferedReader.close();
        }
    }

    public static void process(Runnable runnable) {
        runnable.run();
    }

    public static <T> void prettyPrintApple(List<T> apples, Filter<T> filter) {
        for (T apple : apples) {
            if (filter.test(apple)) {
                System.out.println(apple);
            }
        }
    }

}
