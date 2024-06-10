import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class testInvertFile {

    private InvertContentFile testOcject = new InvertContentFile();
    private File createfileToTest = new File("test/testFolder/TestFolder1/testFiletoInvert.txt");

    @Test
    public void testCheckIfFileIsFile(){
        testIfFileIsSavedProperly();

        Assertions.assertTrue(testOcject.checkIfFileisFile(createfileToTest));
    }

    @Test
    public void testIfFileIsSavedProperly() {

        ///create new file with certain string to invert
        String toInvert = "1a 2bc 3de 4ef";

        try {
            FileWriter fw = new FileWriter(createfileToTest);
            fw.write(toInvert);
            fw.close();
        } catch (IOException e) {
            System.out.println("cant save file!");
        }

        Assertions.assertTrue(testOcject.invertFile(String.valueOf(createfileToTest)));
    }

    @Test
    public void testIfFileIsInvertedProperly() {

        testIfFileIsSavedProperly();

        ///create new file with certain string to invert
        String toInvert = "1a 2bc 3de 4ef";

        try {
            FileWriter fw = new FileWriter(createfileToTest);
            fw.write(toInvert);
            fw.close();
        } catch (IOException e) {
            System.out.println("cant save file!");
        }

        String predicted = "4ef 3de 2bc 1a";

        String pathToInverted = createfileToTest.getParent() + "\\inverted_" + createfileToTest.getName();

        Assertions.assertEquals(predicted, testOcject.readFile(pathToInverted));
    }

    // Bad Way

    @Test
    public void testCheckIfFileIsNotFile(){
        testIfFileIsSavedProperly();

        File file = new File("test/testFolder/TestFolder1");

        Assertions.assertFalse(testOcject.checkIfFileisFile(file));
    }

    @Test
    public void testIfFileIsSavedWrong() {

        ///create new file with certain string to invert
        String toInvert = "1a 2bc 3de 4ef";

        try {
            FileWriter fw = new FileWriter(createfileToTest);
            fw.write(toInvert);
            //deleted close() from writer
        } catch (IOException e) {
            System.out.println("cant save file!");
        }

        Assertions.assertFalse(testOcject.invertFile(String.valueOf(createfileToTest)));
    }

    @Test
    public void testIfFileIsInvertedWrong() {

        String predictedNotInverted = "1a 2bc 3de 4ef";

        //create file before test
        testIfFileIsInvertedProperly();

        String pathToInverted = createfileToTest.getParent() + "\\inverted_" + createfileToTest.getName();

        Assertions.assertNotEquals(predictedNotInverted, testOcject.readFile(pathToInverted));
    }

}
