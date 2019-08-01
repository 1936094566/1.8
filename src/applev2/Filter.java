package applev2;

/**
 * @author machao
 * @date 2019/7/17
 * @time 16:41
 * @description
 **/
public  interface  Filter<T> {
     boolean test(T obj);
}
