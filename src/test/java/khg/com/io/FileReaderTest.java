package khg.com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("D:\\idproject\\test\\src\\test\\java\\khg\\com\\io\\dat1.dat");
            fileWriter = new FileWriter("D:\\idproject\\test\\src\\test\\java\\khg\\com\\io\\out.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int c = 0;
        try {
            while ((c = fileReader.read())!= -1){
                System.out.print((char)c);
                fileWriter.write(c);
            }
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
