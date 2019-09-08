import java.util.Scanner;

/**
 * @Created with IDEA
 * @author:麻超
 * @Date:2019/9/8
 * @Time:21:06
 **/
public class CalUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("计算器开始....");
        int i = Integer.valueOf(sc.nextLine());
        String fuHao = sc.nextLine();
        int j = Integer.valueOf(sc.nextLine());
        Integer result = null;
        switch (fuHao) {
            case "+":
                result = i + j;
                break;
            case "-":
                result = i - j;
                break;
            case "*":
                result = i * j;
                break;
            case "/":
                result = i / j;
                break;
            case "%":
                result = i % j;
                break;

            default:
                System.out.println("输入符号错误");
        }
        System.out.println("结果是:" + result);
    }
}
