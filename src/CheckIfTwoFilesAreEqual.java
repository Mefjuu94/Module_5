import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckIfTwoFilesAreEqual {

    public boolean areTextFilesEqual(String filePath1, String filePath2) {

        String text1 = "";
        String text2 = "";
        if (filePath1 == null || filePath2 == null){
            return false;
        }
        Boolean file1 = new File(filePath1).exists() && new File(filePath1).isFile();
        Boolean file2 = new File(filePath2).exists() && new File(filePath2).isFile();

        if (file1 && file2) {

            try (FileReader readerFile1 = new FileReader(filePath1);
                 FileReader readerFile2 = new FileReader(filePath2);

                 BufferedReader br1 = new BufferedReader(readerFile1);
                 BufferedReader br2 = new BufferedReader(readerFile2)) {


                text1 = br1.readLine();
                text2 = br2.readLine();


                while (text1 != null && text2 != null) {

                    if (!text1.equals(text2)) {
                        return false;
                    }

                    text1 = br1.readLine();
                    text2 = br2.readLine();
                }

            } catch (IOException e) {
                return false;
            }

        }else {
            System.out.println("File not found!");
            return false;
        }
        return true;
    }

}
