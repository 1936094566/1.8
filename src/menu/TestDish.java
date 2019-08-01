package menu;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/7/23
 * @time 11:23
 * @description
 **/
public class TestDish {
    public static void main(String[] args) {
        /*List<Dish> dishes = Common.getDishes();
        List<String> collect = dishes.stream().filter(d -> d.getCalories() > 300)
                .map(Dish::getName).limit(3).collect(Collectors.toList());
        System.out.println(collect);*/
        List<Integer> ids = Arrays.asList(11,12,1,111,2);

        Map<String,Object> map1 =new LinkedHashMap<>();
        map1.put("id",11);
        map1.put("ids",11);
        map1.put("idd",11);

        Map<String,Object> map2=new LinkedHashMap<>();
        map2.put("id",1);
        map2.put("ids",11);
        map2.put("idd",11);
        Map<String,Object> map3 =new LinkedHashMap<>();
        map3.put("id",111);
        map3.put("ids",111);
        map3.put("idd",111);

        List<Map> returnData = new ArrayList<>();
        returnData.add(map1);
        returnData.add(map2);
        returnData.add(map3);

        ids.stream().filter(s -> {
            boolean flag = !returnData.stream().map(t -> t.get("id")).collect(Collectors.toList()).contains(s);
            if(flag){
                Map<String,Object> map4 =new LinkedHashMap<>();
                map4.put("id",s);
                map4.put("ids",111);
                map4.put("idd",111);
                returnData.add(map4);
            }

            return  flag ;
        }).collect(Collectors.toList());
        System.out.println(returnData);
    }

}
