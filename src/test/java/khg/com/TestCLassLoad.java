package khg.com;

public class TestCLassLoad {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(TestCLassLoad.class.getClassLoader().getClass().getSimpleName());
    }
}
