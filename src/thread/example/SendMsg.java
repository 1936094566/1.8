package thread.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SendMsg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要发送的总数量:____");
        String data = scanner.nextLine();
        Integer allCount = Integer.valueOf(data);
        System.out.println("输入分批发送的数量:____");
        String data2 = scanner.nextLine();
        Integer batchNum = Integer.valueOf(data2);
        if (allCount/batchNum == 0){
            Thread thread = new Thread(new SendThread(initUser(0,allCount)));
            thread.start();
        }else{
            for(int i = 0;i<=allCount/batchNum;i++){
                Thread thread = new Thread(new SendThread(initUser(i*batchNum,batchNum)));
                thread.start();
            }
        }

    }
    public static List<User> initUser(int start ,int count){
        List<User> users = new ArrayList<>(count);
        for(int i = 0 ;i< count ;i++){
            User user = new User(i,"example"+i+"号");
            users.add(user);
        }
        return users;
    }

}
