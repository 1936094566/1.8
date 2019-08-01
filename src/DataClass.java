import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/7/25
 * @time 18:08
 * @description
 **/
public class DataClass {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("tags/","tags/zs/","tags/beijing/","tags/guangzhou/","tags/beijing/xicheng/","tags/beijing/dongcheng/","tags/beijing/xicheng/yuanchenxin/","tags/guangzhou/yuexiu/");
//        Tag tags = getTagByTagName("tags", data, "");
//        System.out.println(tags);

        List<Tag> deviceTagList = new ArrayList<>();
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();
        data.forEach(e -> {
            String substring = e.substring(e.indexOf("/") + 1, e.length());
            String substring1 = null;
            if (!"".equals(substring)) {
                substring1 = substring.substring(0, substring.indexOf("/"));
                set.add(substring1);
            }
            list.add(substring);
        });
        set.forEach(e -> {
            deviceTagList.add(getTagByTagName( e, list, "",e));
        });

    }

    /**
     *
     * @param prefix tags
     * @return
     */
    public static Tag getTagByTagName(String name,List<String> data,String parentName,String typeName){
        String prefix = parentName+name+"/";
        Tag tag = new Tag();
        Set<String> collect = data.stream().filter(s -> s.contains(prefix)&&!s.equals(prefix)).map(
               s->{
                  s = s.replaceFirst(prefix, "");
                  int index = s.indexOf("/");
                  s = s.substring(0, index);
                  return s;
               }
        ).collect(Collectors.toSet());
        tag.setName(typeName);
        if(!typeName.equals(name)){
            tag.setValue(name);
        }
        List<Tag> tags = new ArrayList<>();
        for(String str  : collect){
            Tag tag1 = getTagByTagName(str, data, prefix,typeName);
            tags.add(tag1);
        }
        tag.setTags(tags);
        System.out.println(collect);
        return tag;

    }


}
