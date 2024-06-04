import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class FileExercises {

    Path path = Path.of("D:\\");

    FileExercises(){

    }

    public List<String> scanDirectoryForFiles(Path path){

        File file = new File(String.valueOf(path));
        String[] list = Objects.requireNonNull(file.list());
        List<String> listOfFiles = new ArrayList<>();

        for (String s : list) {
            File fileFromList = new File(path + "\\" + s);
            if (fileFromList.isFile()) {
                listOfFiles.add(s);
            }
        }

        return listOfFiles;
    }

    public List<String> scanDirectoryForDirectores(Path path){

        File file = new File(String.valueOf(path));
        String[] list = Objects.requireNonNull(file.list());
        List<String> listOfDirectores = new ArrayList<>();

        for (String s : list) {
            File fileFromList = new File(path + "\\" + s);
            if (fileFromList.isDirectory()) {
                listOfDirectores.add(s);
            }
        }

        return listOfDirectores;
    }

    public void printDirectory(String directoryPath){
        File file = new File(String.valueOf(path));
        String[] list = Objects.requireNonNull(file.list());
        for (String s : list) {
            System.out.println(s);
        }
    }

    public boolean writeUserInputToFile() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write content to your file!");
        String content = scanner.next();
        String fileName = "demo.txt";
        File myFile = new File(String.valueOf(path) + fileName);

        try {
            myFile.createNewFile();
            


            return true;
        }catch (IOException e){

            System.out.println("something going wrong");
        return false;
        }


    }
    public void readFromFile(String fileName){

    }


}
