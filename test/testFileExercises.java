import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testFileExercises {

    private FileExercises testObject = new FileExercises();

    @Test
    public void testPrintDirectory(){
        String path = "test/testFolder/";
        testObject.printDirectory(path);

        List<String> listOfPredicted = new ArrayList<>();
        listOfPredicted.add("testFile1.txt");
        listOfPredicted.add("testFile2.txt");
        listOfPredicted.add("TestFolder1");
        listOfPredicted.add("TestFolder2");

        Assertions.assertEquals(listOfPredicted,testObject.printDirectory(path));
    }

    @Test
    public void testReadFromFile(){
        String path = "test/testFolder/";
        String predicted = "ala ma kota\n" +
                "kot ma ale\n" +
                "ze ala go ma\n";

        Assertions.assertEquals(predicted,testObject.readFromFile(path,"testFile1.txt"));
    }



    //bad
    @Test
    public void testPrintDirectoryNoOrder(){
        String path = "test/testFolder/";
        testObject.printDirectory(path);

        List<String> listOfPredicted = new ArrayList<>();
        listOfPredicted.add("TestFolder1");
        listOfPredicted.add("testFile2.txt");
        listOfPredicted.add("TestFolder2");
        listOfPredicted.add("testFile1.txt");

        Assertions.assertNotEquals(listOfPredicted,testObject.printDirectory(path));
    }

    @Test
    public void testPrintDirectoryMissingRecord(){
        String path = "test/testFolder/";
        testObject.printDirectory(path);

        List<String> listOfPredicted = new ArrayList<>();
        listOfPredicted.add("TestFolder1");
        listOfPredicted.add("testFile2.txt");
        listOfPredicted.add("testFile1.txt");

        Collections.sort(listOfPredicted);
        Assertions.assertNotEquals(listOfPredicted,testObject.printDirectory(path));
    }

}
