package khg.com;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private String value = null;
    public Test(String v){
        value = v;
    }
    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(o instanceof Test) {
            Test test = (Test) o;
            return value.equals(test.value);
        }
        return false;
    }

    public static void main(String[] args){
        List list = new ArrayList();
        Test test1 = new Test("object");
        Test test2 = new Test("object");
        Test test3 = new Test("object");
        Object test4 = new Test("object");
        list.add(test1);
        System.out.println(list.contains(test2));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(test2.equals(test3));
        System.out.println(test3.equals(test4));
    }
}
