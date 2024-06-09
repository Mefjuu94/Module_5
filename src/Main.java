import java.io.File;
import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\Orzi\\IdeaProjects\\Module_5\\src";
        FileExercises fe = new FileExercises();
        System.out.println("Files:");
        System.out.println(fe.scanDirectoryForFiles(Path.of(path)));
        System.out.println("Directores:");
        System.out.println(fe.scanDirectoryForDirectores(Path.of(path)));
        System.out.println("Print all:");
        fe.printDirectory(String.valueOf(Path.of(path)));

        fe.readFromFile("test/testFolder/","testFile1.txt");

        System.out.println("-----------------------");

        CheckIfTwoFilesAreEqual c2Files = new CheckIfTwoFilesAreEqual();
        System.out.println(c2Files.areTextFilesEqual("test/testFolder/testFile1.txt","test/testFolder/testFile2notEqualTo1.txt")); // false
        System.out.println(c2Files.areTextFilesEqual("test/testFolder/testFile1.txt","test/testFolder/testFile3equalsto1.txt")); // true

        String filepath = "test/testFolder/filetoInvert.txt";

        InvertContentFile icf = new InvertContentFile();
        System.out.println(icf.invertFile(filepath));

//        System.out.println("*********delete files to see if test going well**************");
//        icf.deleteFiles("test/testFolder/TestFolder1/");

    }
}