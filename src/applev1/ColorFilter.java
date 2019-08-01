package applev1;

/**
 * @author machao
 * @date 2019/7/17
 * @time 16:46
 * @description
 **/
public class ColorFilter implements Filter {
    @Override
    public boolean test(Apple obj) {
        return "Green".equals(obj.getName());
    }
}
