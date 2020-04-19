package data;


import java.util.ArrayList;
import java.util.List;

/**
 * 数组实现环形队列
 */
public class ArrayRingQueue<T> {
    private Object[] arr;
    /**
     * 队列第一个元素存在位置
     */
    private int front;
    /**
     * 队列最后一个元素的后一个位置
     */
    private int refer;

    /**
     * 队列最大容量
     */
    private int maxSize;

    public ArrayRingQueue(int size) {
        this.front = 0;
        this.refer = 0;
        this.maxSize = size;
        arr = new Object[maxSize];
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return front == refer;
    }

    /**
     * 队列是否满了
     *
     * @return
     */
    public boolean isFull() {
        return (refer + 1) % maxSize == front;
    }

    public void addQueue(T t) {
        if (isFull()) {
            System.out.println("队列满,不能加入数据");
        }
        //直接将数据加入
        arr[refer] = (Object) t;
        //将refer后移
        refer = (refer + 1) % maxSize;
    }

    public T getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空,没有元素");
        }
        T value = (T) arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public static void main(String[] args) {
        //ArrayRingQueue<String> arrayRingQueue = new ArrayRingQueue<>(10);
        //arrayRingQueue.addQueue("a");
        //arrayRingQueue.addQueue("b");
        //System.out.println(arrayRingQueue.getQueue());
        //System.out.println(arrayRingQueue.getQueue());
        //System.out.println(arrayRingQueue.getQueue());
        getString();
    }

    public static void getString(){
        List<String> strs = new ArrayList<>();
        strs.add("a");
        strs.add("b");
        strs.add("c");
        StringBuffer result = new StringBuffer("[");
        for (int i = 0;i<strs.size();i++){
            result.append(strs.get(i));
            if (i==strs.size()-1){
                result.append("]");
            }else{
                result.append(",");
            }
        }
        System.out.println(result.toString());

    }

}
