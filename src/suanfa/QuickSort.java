package suanfa;

/**
 * @author machao
 * @date 2019/8/22
 * @time 15:17
 * @description
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {23, 4, 12, 31, 2, 6};
        quickSort(nums,0,nums.length-1);
    }

    public static void quickSort(int[] nums,int left ,int right){
        if(nums==null||nums.length==0||left <0||right <0){
            return ;
        }

        int num = nums[left];
        int start = left;
        int end = right;

        while(start < end){
           while (start < end && num <= nums[end]){
               end --;
           }
            nums[start] = nums[end];

            while(start < end && num > nums[start]){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[end] = num;
        if(start > left){
            quickSort(nums,left,start-1);
        }
        if(end<right){
            quickSort(nums,end+1,right);
        }
    }
}
