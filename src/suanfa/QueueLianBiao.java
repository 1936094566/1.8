package suanfa;

/**
 * @author machao
 * @date 2019/8/28
 * @time 14:17
 * @description
 **/
public class QueueLianBiao<E> {
    /**
     * 开始节点
     */
    private Node<E> startNode;

    /**
     * 结束节点
     */
    private Node<E> endNode;


    public boolean inQueue(E data) {
        Node<E> eNode = new Node<>(data);
        if (endNode == null) {
            endNode = eNode;
            startNode = eNode;
        } else {
            endNode.nextNode = eNode;
            endNode = eNode;
        }
        return true;
    }
    public E outQueue() {
        if (startNode == null){
            throw new IndexOutOfBoundsException("队列为空");
        }
        E data = startNode.data;
        if(startNode.nextNode == null){
            endNode =  null;
        }else{
            startNode = startNode.nextNode;
        }
        return data;
    }

    public void clear(){
        if(startNode != null){
            startNode = null;
        }
        if(endNode != null){
            endNode = null;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> node = startNode;
        while(node!=null){
            sb.append(node.data.toString()).append(",");
            node = node.nextNode;
        }
        return sb.toString();
    }

    private class Node<F> {
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
