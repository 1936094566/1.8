package suanfa;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author machao
 * @date 2019/8/27
 * @time 15:28
 * @description
 **/
public class LianBiao<T> {
    private Node<T> header;
    private int size;
    private Node<T> last;

    /**
     * 添加元素
     *
     * @param t
     * @return
     */
    public boolean add(T t) {
        addLast(t);
        return true;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            sb.append(node.data.toString()).append(",");
            node = node.nextNode;
        }
        return sb.toString();
    }

    public void add(int index, T t) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(" 超过链表边界 ");
        }
        Node<T> node = new Node<>(t);
        if (size == 0) {
            header = node;
            last = node;
            size++;
        } else if (index == 0) {
            //插入头部
            addFirst(t);
        } else if (size == index + 1) {
            //插入尾部
            addLast(t);
        } else {
            //index 比 size 小1
            //例如,插入第一个index = 1 ,需要取得index 为 0的位置的数据
            Node<T> preNode = getNode(index - 1);
            node.nextNode = preNode.nextNode;
            preNode.nextNode = node;
            size++;
        }
    }

    /**
     * 插入最后
     *
     * @param t
     */
    public void addLast(T t) {
        Node<T> node = new Node<>(t);
        if (header == null) {
            header = node;
        }
        if (last == null) {
            last = node;
        } else {
            last.nextNode = node;
            last = node;
        }
        size++;
    }

    /**
     * 从集合中移除对象
     *
     * @param index
     */
    public void remove(int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(" 超过链表边界 ");
        }
        if (index == 0) {
            Node<T> node = getNode(index + 1);
            header = node;
        } else if (index + 1 == size) {
            Node<T> node = getNode(index - 1);
            node.nextNode = null;
            last = node;
        } else {
            Node<T> preNode = getNode(index - 1);
            Node<T> node = preNode.nextNode;
            preNode.nextNode = node.nextNode;
        }
        size --;
    }

    public void addFirst(T t) {
        Node<T> node = new Node<>(t);
        if (last == null) {
            last = node;
        }
        if (header == null) {
            header = node;
        } else {
            header.nextNode = node;
            header = node;
        }
        size++;
    }

    private Node<T> getNode(int index) {
        Node<T> node;

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(" 超过链表边界 ");
        } else if (index == 0) {
            node = header;
        } else if (index == size) {
            node = last;
        } else {
            node = header;
            for (int i = 0; i < index; i++) {
                node = node.nextNode;
            }
        }
        return node;
    }

    class Node<F> {
        public F data;
        public Node<F> nextNode;

        public Node(F data, Node<F> nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }

        public Node(F data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
