import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvertContentFile{

    public boolean invertFile(String filepath) {

        File file = new File(filepath);
        if (checkIfFileExist(file) && checkIfFileisFile(file)) {
            String filename = file.getName();
            String pathtoFile = file.getParent();

            StringBuilder fileContent = new StringBuilder();
            String text = "";
            ArrayList<String> listOfWords = new ArrayList<>();

            try (FileReader reader = new FileReader(filepath);
                 BufferedReader br = new BufferedReader(reader)) {
                text = br.readLine();
                System.out.println("Content of file:");
                while (text != null) {

                    System.out.println(text);
                    String[] split = text.split(" ");

                    listOfWords.addAll(Arrays.asList(split));

                    text = br.readLine();
                }

                if (listOfWords.isEmpty()) {
                    System.out.println("something going wrong! No Words!");
                    return false;
                } else {
                    //iteray array backwards and save by StringBuilder
                    for (int i = listOfWords.size() - 1; i >= 0; i--) {
                        fileContent.append(listOfWords.get(i)).append(" ");
                    }

                    File invertedFile = new File(pathtoFile + "\\" + "inverted_" + filename);
                    try (FileWriter fw = new FileWriter(invertedFile)) {
                        fw.append(fileContent);

                        fw.flush();
                    }

                }
            } catch (IOException e) {
                System.out.println("File not found!");
                return false;
            }
            return true;
        } else
            return false;

    }


    public String readFile(String filepath) {

        if (checkIfFileExist(new File(filepath)) && checkIfFileisFile(new File(filepath))) {
            StringBuilder stringBuilder = new StringBuilder();
            String text = "";
            String result = "";

            try (FileReader reader = new FileReader(filepath);
                 BufferedReader br = new BufferedReader(reader)){

                text = br.readLine();
                while (text != null) {
                    stringBuilder.append(text);
                    text = br.readLine();
                }
                result = stringBuilder.toString();
            } catch (IOException e) {
                System.out.println("cant read file!");
                return null;
            }
            return result.trim(); // clean white spaces
        } else
            return null;
    }

    public void deleteFiles(String path) {

        FileExercises fe = new FileExercises();
        List<String> list = fe.printDirectory(path);

        for (String f : list) {
            File file = new File(path + f);
            if (file.exists() && file.isFile()) {
                try {
                    System.out.println("delete file: " + file.getName());
                    Files.delete(file.toPath());
                } catch (IOException e) {
                    System.out.println("File do not exist!");
                }
            }
        }

    }

    public boolean checkIfFileisFile(File file) {
        return file.isFile();
    }

    public boolean checkIfFileExist(File file) {
        return file.exists();
    }

}
