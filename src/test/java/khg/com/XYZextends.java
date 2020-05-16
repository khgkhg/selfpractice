package khg.com;

public class XYZextends {
    public static void main(String[] args){
        new Z();
    }
}
class X{
    V b = new V();
    X(){
        System.out.printf("X");
    }
    X(int a){
        System.out.printf("a");
    }
}
class Y{
    Y(){
        System.out.printf("Y");
    }
}
class V{

    V(){
        System.out.printf("V");

    }
}
class Z extends X{
    Y b = new Y();
    Z(){
        System.out.printf("Z");
    }
}