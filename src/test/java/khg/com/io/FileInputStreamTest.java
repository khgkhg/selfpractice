package khg.com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        int c=0;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\idproject\\test\\src\\test\\java\\khg\\com\\io\\dat1.dat");
            fileOutputStream = new FileOutputStream("D:\\idproject\\test\\src\\test\\java\\khg\\com\\io\\out.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while ((c = fileInputStream.read()) != -1){
                System.out.println((char)c);
                fileOutputStream.write(c);
            }
            fileInputStream.close();
            fileOutputStream.close();
           } catch (IOException e) {
               e.printStackTrace();
           }

    }
}
