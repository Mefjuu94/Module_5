//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileExercises fe = new FileExercises();
        System.out.println("Files:");
        System.out.println(fe.scanDirectoryForFiles(fe.path));
        System.out.println("Directores:");
        System.out.println(fe.scanDirectoryForDirectores(fe.path));
        System.out.println("Print all:");
        fe.printDirectory(String.valueOf(fe.path));
        fe.writeUserInputToFile();

    }
}