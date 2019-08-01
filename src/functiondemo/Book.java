package functiondemo;

/**
 * @author machao
 * @date 2019/7/19
 * @time 15:52
 * @description
 **/
public class Book {
    public String name = "book";

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Book(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
