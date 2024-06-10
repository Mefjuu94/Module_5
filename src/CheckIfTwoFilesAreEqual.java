import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class CheckIfTwoFilesAreEqual implements Closeable {

    public boolean areTextFilesEqual(String filePath1, String filePath2){

        String text1 = "";
        String text2 = "";

        try (FileReader readerFile1 = new FileReader(filePath1);
             FileReader readerFile2 = new FileReader(filePath2);

             BufferedReader br1 = new BufferedReader(readerFile1);
             BufferedReader br2 = new BufferedReader(readerFile2)){


            text1 = br1.readLine();
            text2 = br2.readLine();


            while (text1 != null && text2!=null ) {
                return text1.equals(text2);
            }

        } catch (IOException e) {
            System.out.println("File not found!");
        }

        return true;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closing resources");
    }
}
