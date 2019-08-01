package stream;

import applelv3.Common;
import applelv3.Trader;
import applelv3.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/8/1
 * @time 14:28
 * @description
 **/
public class StreamReduceDemo {
    /**
     * (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
     * (2) 交易员都在哪些不同的城市工作过？
     * (3) 查找所有来自于剑桥的交易员，并按姓名排序。
     * (4) 返回所有交易员的姓名字符串，按字母顺序排序。
     * (5) 有没有交易员是在米兰工作的？
     * (6) 打印生活在剑桥的交易员的所有交易额。
     * (7) 所有交易中，最高的交易额是多少？
     * (8) 找到交易额最小的交易。
     * @param args
     */
    public static void main(String[] args) {
        questionFive();
    }
    public static void questionOne(){
        List<Transaction> transaction = Common.getTransaction();
        List<Transaction> collect = transaction.stream().filter(s -> s.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void questionTwo(){
        List<Transaction> transaction = Common.getTransaction();
        List<String> city = transaction.stream().map(s -> s.getTrader()).map(s -> s.getCity()).distinct().collect(Collectors.toList());
        System.out.println(city);
    }
    public static void questionThree(){
        List<Transaction> transaction = Common.getTransaction();
        List<Trader> trader = transaction.stream().map(s -> s.getTrader())
                .filter(s -> "Cambridge".equals(s.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(trader);
    }
    public static void questionFour() {
        List<Transaction> transaction = Common.getTransaction();
        String name = transaction.stream()
                .map(s -> s.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(name);
    }
    public static void questionFive() {
        List<Transaction> transaction = Common.getTransaction();
        boolean milan = transaction.stream()
                .anyMatch(s->s.getTrader().getCity().equals("Milan"));
        System.out.println(milan);
    }
    public static void questionSix() {
        List<Transaction> transaction = Common.getTransaction();
        transaction.stream()
                .filter(s->"Cambridge".equals(s.getTrader().getCity()))
                .forEach(s->System.out.println(s.getValue()));
    }
    public static void questionSeven() {
        List<Transaction> transaction = Common.getTransaction();
        transaction.stream()
                .map(s->s.getValue()).reduce(Integer::max).ifPresent(s->System.out.println(s));
    }
    public static void questionEight() {
        List<Transaction> transaction = Common.getTransaction();
        Optional<Integer> reduce = transaction.stream()
                .map(s -> s.getValue()).reduce(Integer::min);
        System.out.println(reduce);
    }
}
