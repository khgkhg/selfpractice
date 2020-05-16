package khg.com;

import org.openjdk.jol.info.ClassLayout;

import java.util.HashSet;
import java.util.Set;

public class ObjectLayout {
    public static void main(String[] args) {
        Object o = new Object();
      //  System.out.println(ClassLayout.parseInstance(o).toPrintable());
        A a1 = new A("a1");
        System.out.println(ClassLayout.parseInstance(a1).toPrintable());
        String set = "";
        System.out.println(ClassLayout.parseInstance(set).toPrintable());


    }
}

class A {
    private String name;//4 + 8 + 12  24
    private double aDouble = 1.1D;

    public A(String name) {
        this.name = name;
    }
}
    class B{
       // private String name;
       // private double aDouble=1.1D;
}
