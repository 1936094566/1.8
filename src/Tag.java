import java.util.List;

/**
 * @author machao
 * @date 2019/7/25
 * @time 18:21
 * @description
 **/
public class Tag {
    private String name;
    private String value;
    private List<Tag> tags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
