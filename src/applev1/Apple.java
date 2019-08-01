package applev1;


/**
 * @author machao
 * @date 2019/7/17
 * @time 16:38
 * @description
 **/
public class Apple {
    private String name;
    private Integer weight;
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Apple(String name, Integer weight, String level) {
        this.name = name;
        this.weight = weight;
        this.level = level;
    }

    public Apple() {
    }


    @Override
    public String toString() {
        return "applev1.Apple{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Apple(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
