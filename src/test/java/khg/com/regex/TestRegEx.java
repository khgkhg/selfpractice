package khg.com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]{3}");
        Matcher m = p.matcher("acb");
        //.
        //* 0+
        //+ 1+
        //?  0或1
       //
     /*   p("a".matches("[abc]"));
        p("a".matches("[^ ]"));
        p("A".matches("[a-zA-Z]"));
        p("A".matches("[a-z]|[A-Z]"));
        p("A".matches("[a-z[A-Z]]"));
        p("R".matches("[A-Z&&[RFG]]"));*/

      // \d  \D   \s  \S \w  \W
   /*     p(" \n\r\t".matches("\\s{4}"));
        p(" ".matches("\\S"));
        p("a_8".matches("\\w{3}"));
        p("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
        p("\\".matches("\\\\"));*/

      // |$  ^\b 单词边界
/*        p("hellp wb".matches("^h.*\\b"));
        p("sjljf234krjg89hg".matches(".*hg$"));
        //  whilte line
        p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));*/

      p("292333874@qq.com".matches("^\\w*@{1}\\w+[comn]$"));
    }
    public static void p(Object o){
        System.out.println(o);
    }
}
