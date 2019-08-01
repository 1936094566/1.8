package applev1;

/**
 * @author machao
 * @date 2019/7/17
 * @time 16:42
 * @description
 **/
public  class WeightFilter implements  Filter{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
}
