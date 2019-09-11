import java.util.Random;
import java.util.Scanner;

/**
 * @Created with IDEA
 * @author:麻超
 * @Date:2019/9/11
 * @Time:23:42
 **/
public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("请输入要猜数字的范围!");
        Scanner sc = new Scanner(System.in);
        int max = Integer.valueOf(sc.nextLine());
        Random random  = new Random();
        Integer nums = random.nextInt(max);

        int guessNum = -1;
        while(guessNum != nums){
            System.out.println("请输入要猜测的数字");
            guessNum = Integer.valueOf(sc.nextLine());
            if(guessNum<nums){
                System.out.println("猜小了");
            }else if(guessNum==nums){
                System.out.println("猜对啦这个数是"+nums+"猜的是"+guessNum);
            }else{
                System.out.println("猜大了");
            }

        }
    }

}
