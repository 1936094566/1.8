package thread.example;

import lombok.Data;

import java.util.List;

@Data
public class SendThread implements Runnable {
    private List<User> users;
    public SendThread(List<User> users){
        this.users = users;
    }
    @Override
    public void run() {
        if(users != null || users.size() != 0){
            for(User user : users){
                System.out.println(String.format("线程%s,发送给id:%s,name:%s,发送成功!",Thread.currentThread().getName(),user.getId(),user.getName()));
            }
        }else{
            System.out.println("发送的用户列表为空");
        }
    }
}
