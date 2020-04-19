package suanfa;


/**
 * @author machao
 * @date 2019/8/27
 * @time 16:25
 * @description
 **/
public class TestClass {
    //@Test
    public  void testLianBiao(){
        //27 03
        LianBiao<String> lianBiao = new LianBiao<>();
        lianBiao.add("zhangsan");
        lianBiao.add("lisi");
        lianBiao.add("wangwu");
        lianBiao.add("zhaoliu");
        lianBiao.add(4,"zdjz");
        System.out.println(lianBiao);
        lianBiao.remove(4);
        System.out.println(lianBiao);
        lianBiao.remove(2);
        System.out.println(lianBiao);
        lianBiao.remove(0);
        System.out.println(lianBiao);
        System.out.println(lianBiao.getSize());
    }


    public void testQueueLianBiao(){
        QueueLianBiao<String> stringQueueLianBiao = new QueueLianBiao<>();
        stringQueueLianBiao.inQueue("A");
        stringQueueLianBiao.inQueue("B");
        stringQueueLianBiao.inQueue("C");
        stringQueueLianBiao.inQueue("D");
        stringQueueLianBiao.inQueue("E");
        System.out.println(stringQueueLianBiao);
        System.out.println(stringQueueLianBiao.outQueue());
        System.out.println(stringQueueLianBiao.outQueue());
        System.out.println(stringQueueLianBiao.outQueue());
        System.out.println(stringQueueLianBiao.outQueue());
        System.out.println(stringQueueLianBiao.outQueue());
        stringQueueLianBiao.inQueue("F");
        stringQueueLianBiao.inQueue("G");
        stringQueueLianBiao.inQueue("H");
        stringQueueLianBiao.inQueue("L");
        System.out.println(stringQueueLianBiao);
        stringQueueLianBiao.clear();
        System.out.println("这里是clear之后:"+stringQueueLianBiao);
    }

}
