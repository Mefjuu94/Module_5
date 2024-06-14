import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCheckTwoFiles {

    private CheckIfTwoFilesAreEqual testObject = new CheckIfTwoFilesAreEqual();

    private String file1 = "test/testFolder/testFile1.txt";
    private String file2noEqual = "test/testFolder/testFile2notEqualTo1.txt";
    private String file3EqualTo1 = "test/testFolder/testFile3equalsto1.txt";


    //happy path
    @Test
    public void testCheckTwoFilesAreEqual(){
        Assertions.assertTrue(testObject.areTextFilesEqual(file1,file3EqualTo1));
    }


    //not happy
    @Test
    public void testCheckTwoFilesAreNotEqual(){
        Assertions.assertFalse(testObject.areTextFilesEqual(file1,file2noEqual));
    }

    @Test
    public void testCheckTwoFilesAreEqualNoFile(){
        Assertions.assertFalse(testObject.areTextFilesEqual(file1," "));
    }
    @Test
    public void testCheckTwoFilesAreNotEqualNull(){
        Assertions.assertFalse(testObject.areTextFilesEqual(null,file2noEqual));
    }
}
