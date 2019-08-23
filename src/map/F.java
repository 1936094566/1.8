package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author machao
 * @date 2019/8/21
 * @time 10:59
 * @description
 **/
public class F {
    public Map<String,String> map = new HashMap<>();
    public void setMap(String name){
        map.put(name,name);
    }
}
