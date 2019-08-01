package menu;

/**
 * @author machao
 * @date 2019/7/23
 * @time 11:18
 * @description
 **/
public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final Integer calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, Integer calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Integer getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type{MEAT,FISH,OTHER}

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
