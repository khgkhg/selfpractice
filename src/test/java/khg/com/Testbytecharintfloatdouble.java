package khg.com;

public class Testbytecharintfloatdouble {
    public static void main(String[] args) {
        int i = 1,j=0;
        float f1 = 0.1f; float f2 = 123;
        long l1 = 12345678,l2 = 8888888888L;
        double d1 = 2e20,d2 =124;
        byte b1 = 1,b2 = 2,b3 = 122;
        j = j+10;
        i = i/10;
        i = (int) (i*0.1);
        char c1 = 'a',c2 =125;
        byte b =(byte) (b1 -b2);
        char c= (char)(c1+c2-1);
        float f3 = f1+f2;
        float f4 =(float) (f1+f2*0.1);
        double d = d1*i+j;
        float f = (float)(d1*5+d2);
        byte b4 = 67;
        byte b5 = 89;

        byte cb =(byte)(b4+b5);
        System.out.println((char)cb);

        double a = 4d;
        double e = 5.584733d;
        if (e>a){
            System.out.println(true);
        }
    }
}
