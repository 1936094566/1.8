package suanfa;

import java.util.Arrays;

/**
 * @author machao
 * @date 2019/8/28
 * @time 9:39
 * @description 队列(数组实现)
 **/
public class Queue<T> {
    private T[] arr;
    /**
     * 队列头
     */
    private int start;

    /**
     * 队尾
     */
    private int refer;

    /**
     * 循环
     * @param num
     * @return
     */
    private int loopSize(int num){
        return  (num + 1)% arr.length;
    }

    public void printArr(){
        System.out.println(Arrays.toString(arr));
    }


    public Queue(int size) {
        arr = (T[])new Object[size];
    }

    public boolean inQueue(T data){
        if (loopSize(refer) == start){
            throw new IndexOutOfBoundsException("栈内数据已满");
        }
        arr[refer] = data;
        refer = loopSize(refer);
        return true;

    }

    public T outQueue(){
        if(refer == start){
          throw new IndexOutOfBoundsException("栈内数据已空");
        }
        T data = arr[start];
        arr[start] = null;
        start = loopSize(start);
        return data;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = start;i!=refer;i=loopSize(i)){
            stringBuilder.append(arr[i].toString());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(6);
        queue.inQueue("A");
        queue.inQueue("B");
        queue.inQueue("C");
        queue.inQueue("D");
        queue.inQueue("E");
        System.out.println(queue.toString());
        queue.outQueue();
        System.out.println(queue.toString());
        queue.outQueue();
        System.out.println(queue.toString());
        queue.inQueue("F");
        queue.inQueue("G");
        System.out.println(queue.toString());
        queue.outQueue();
        queue.printArr();
    }
}
