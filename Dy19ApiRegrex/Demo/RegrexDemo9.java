package Demo;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegrexDemo9 {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java1,因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        System.out.println(s);
        // ? 代表前面的那个Java字符串，=代表后面要跟随的变量 但是在获取的时候，只获取前面的部分，也就是java
        // 就是匹配可以匹配java8 但是最后只会打印Java
        Pattern p = Pattern.compile("(Java)(?=8|11|17)");
        // :代表获取整体
        Pattern p1 = Pattern.compile("(Java)(?:8|11|17)");
        // ！代表后面不能有xxx，还是获取前面
        Pattern p2 = Pattern.compile("(Java)(?!8|11|17)");
        Matcher matcher = p.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
