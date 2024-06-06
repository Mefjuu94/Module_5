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

//        if (fe.writeUserInputToFile()){
//            System.out.println("File has been Created!");
//        }else {
//            System.out.println("something going wrong :(");
//        };

        fe.readFromFile("test/testFolder/","testFile1.txt");

    }
}