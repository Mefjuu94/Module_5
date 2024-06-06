import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class FileExercises {

    private final Path path = Path.of("src/Files/");


    public List<String> scanDirectoryForFiles(Path path) {

        File file = new File(String.valueOf(path));
        String[] list = Objects.requireNonNull(file.list());
        List<String> listOfFiles = new ArrayList<>();

        for (String s : list) {
            File fileFromList = new File(path + s);
            if (fileFromList.isFile()) {
                listOfFiles.add(s);
            }
        }

        return listOfFiles;
    }

    public List<String> scanDirectoryForDirectores(Path path) {

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

    public List<String> printDirectory(String directoryPath) {
        File file = new File(String.valueOf(directoryPath));
        String[] list = Objects.requireNonNull(file.list());
        for (String s : list) {
            System.out.println(s);
        }
        return List.of(list);
    }

    public boolean writeUserInputToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of your file:");
        String fileName = scanner.next();

        System.out.println("Write content to your file! -> '/x' to end");

        File myFile = new File(path + "\\" + fileName);


        try {
            myFile.createNewFile();
            FileWriter writer = new FileWriter(myFile);
            BufferedWriter bw = new BufferedWriter(writer);

            String content = "";
            StringBuilder divideContent = new StringBuilder();

            while (true) {
                content = scanner.nextLine();
                if (!content.isEmpty()) { // to avoid empty saces and New lines
                    divideContent.append(content).append(" ");
                }

                if (content.equalsIgnoreCase("/x")) { // to end writing content
                    bw.write(splitContent(String.valueOf(divideContent)));
                    break;
                }
            }

            bw.flush(); // empty bufor bufferedReader
            bw.close(); // close bufor

            writer.close(); // close writter
            return true;
        } catch (IOException e) {
            System.out.println("something going wrong");
            e.printStackTrace();
            return false;
        }
    }

    public String readFromFile(String path,String fileName) {

        StringBuilder fileContent = new StringBuilder();
        String text = "";

        try {
            FileReader reader = new FileReader(path + fileName);
            BufferedReader br = new BufferedReader(reader);
            text = br.readLine();
            System.out.println("Content of file:");
            while (text != null) {
                fileContent.append(text).append("\n");
                System.out.println(text);
                text = br.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        System.out.println("content: " + String.valueOf(fileContent));
        return String.valueOf(fileContent);
    }

    public String splitContent(String content) {

        String contentTemp = content.replaceAll("\n\r", " "); // everything into one line
        content = contentTemp.replaceAll("  +", " "); // double spaces

        System.out.println(content);

        String[] split = content.split(" ");
        StringBuilder newContent = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (i % 4 == 0 && i != 0) {
                newContent.append("\n");
            }
            newContent.append(split[i]).append(" ");
        }
        return newContent.toString();
    }

    //powinno sie zapisac w paru liniach poniewaz co czwarte slowo jest dzielone wg matody
    //ale to jeszcze nie koniec! bo trzeba dio tego zreobic testy!

}
