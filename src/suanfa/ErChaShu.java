package suanfa;

import java.util.*;

/**
 * @author machao
 * @date 2019/8/22
 * @time 9:49
 * @description 二叉树的实现
 **/
public class ErChaShu {

    private static class  TreeNode<T>{
         T data;
         TreeNode<T> leftNode;
         TreeNode<T> rightNode;
         public TreeNode(T data){
            this.data = data;
         }
    }
    public static <T>TreeNode initTree(LinkedList<T> datas){
        TreeNode<T> returnData = null;
        if(datas != null && datas.size() > 0){
            T data = datas.removeFirst();
            if(data != null){
                returnData = new TreeNode<>(data);
                returnData.leftNode = initTree(datas);
                returnData.rightNode = initTree(datas);
            }
        }
        return returnData;
    }


    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        data.add(8);
        data.add(9);
        TreeNode treeNode = initTree(data);
    }


}
