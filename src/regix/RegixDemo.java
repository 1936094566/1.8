package regix;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @auther 麻超
 * @date 2020/11/1
 */
public class RegixDemo {
    public static void main(String[] args) throws ParseException {
       //System.out.println(Pattern.matches("[a-c[f-p]][b]","ab"));
       //// .匹配任意字符
       //System.out.println(Pattern.matches(".","a"));
       //// \d 匹配数字
       //System.out.println(Pattern.matches("\\d","8"));
       //// \D 匹配非数字
       //System.out.println(Pattern.matches("\\D","a"));
       //// \\w  匹配 A-Z a-z 0-9 _
       //System.out.println(Pattern.matches("\\w","A"));
       //// \\s 匹配一个空格
       //System.out.println(Pattern.matches("\\s"," "));
       //// ?出现一次或者一次没有  * 零次或者多次  + 一次或者多次 {m} 匹配这个字符出现m次   {m,n} 匹配m-n次
       //System.out.println(Pattern.matches("a{4}","aaaa"));

        String str = "数字\n" +
                "       //System.out.println(Pattern.matches(\"\\\\d\",\"8\"));\n" +
                "       //// \\D 1994-06-05匹配非数字\n" +
                "       //System.out1994年6月05日日.println(Pattern.matches(\"\\\\D\",\"a\"));\n" +
                "       //// \\\\w  匹配 A-Z a-z 0-9 _\n" +
                "       //System.out.println(Pa1994/06/05ttern.matches(\"\\\\w\",\"A\"));\n" +
                "       //// \\\\s 匹配一个空格  1994-009996-05   ";
        Pattern compile = Pattern.compile("\\d{4}(-|年|/)\\d{1,2}(-|月|/)\\d{1,2}(日)?");
        Matcher matcher = compile.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("1994-6-6");
        System.out.println(parse);
    }
}
