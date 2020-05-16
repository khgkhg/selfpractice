package khg.com;

public class InnerClass {
    static class one{
        private static class two {
            private static class three {
                public static void main(String[] args) {
                    System.out.println("two");
                }
            }
        }
    }
}