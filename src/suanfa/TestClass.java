package suanfa;

import org.junit.Test;

/**
 * @author machao
 * @date 2019/8/27
 * @time 16:25
 * @description
 **/
public class TestClass {
    @Test
    public  void testLianBiao(){

        LianBiao<String> lianBiao = new LianBiao<>();
        lianBiao.add("zhangsan");
        lianBiao.add("lisi");
        lianBiao.add("wangwu");
        lianBiao.add("zhaoliu");
        lianBiao.add(4,"zdjz");
        System.out.println(lianBiao);

    }
}
