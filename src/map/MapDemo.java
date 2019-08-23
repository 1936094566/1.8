package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author machao
 * @date 2019/8/15
 * @time 9:00
 * @description
 **/
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String zhangsan = map.getOrDefault("zhangsan", null);
        System.out.println(zhangsan);

        int a = 12;

        System.out.println( a+=a-=a*a);

        int x = 023;
        System.out.println(--x);
        int i = 010;
        System.out.println(i);


    }
}
