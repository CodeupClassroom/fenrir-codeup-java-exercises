package fileIO;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {


    public static void main(String[] args) throws IOException {

        //Getting file path using Paths.get() and storing in a Path object
        Path myFirstPathObject = Paths.get("./src/fileIO/data/exampleFile.txt");

//        System.out.println(Files.exists(myFirstPathObject));

        Path fileToReadMe = Paths.get("./README.md");

//        System.out.println("Files.exists(fileToReadMe) = " + Files.exists(fileToReadMe) );


        //Passing String variables into Paths.get() to make a Path object
        String ourLecturePath1 = "src/";

        String ourLecturePath2 = "fileIO/";

        String ourLectureClass = "FileIOLecture.java";

        Path fullPath = Paths.get(ourLecturePath1, ourLecturePath2, ourLectureClass);


//        System.out.println("Files.exists(ourLectureClass) = " + Files.exists(fullPath) );


        //Creating a new directory using String variables as the file path
        String newDirectory = "socks";

        String newDirectories = "dataExperiment/clothes/Fenrir";

//        Files.createDirectory(Paths.get(newDirectory));

//        Files.createDirectories(Paths.get(newDirectories));

        String myDataDirectory = "src/fileIO/data";

        Path pathToNewDirectory = Paths.get(myDataDirectory);

//        System.out.println(pathToNewDirectory);

        if (Files.notExists(pathToNewDirectory)) {
            Files.createDirectory(pathToNewDirectory);
        }


        //Creating a new file using the file path String and filename String
        String myDataTextFile = "data.txt";

        Path directoryAndFile = Paths.get(myDataDirectory, myDataTextFile); //"src/fileIO/data/data.txt"

//        System.out.println(directoryAndFile);

//        Files.createFile(directoryAndFile);


        //Writing data to file using Files.write() and passing in file path and data as variables
        List<String> stooges = Arrays.asList("Larry","Curly","Moe");

        List<String> myData = Arrays.asList("Clifford", "Fenny", "Javascript");


//        Files.write(directoryAndFile, stooges);


//        Files.write(directoryAndFile, myData, StandardOpenOption.APPEND);

        //Reading data from file using Files.readAllLines() and passing in file path as a variable
        System.out.println("Here is the information in our file!");
//        System.out.println(Files.readAllLines(directoryAndFile));

//        System.out.println(Files.readString(directoryAndFile));

        List<String> fileInfo = Files.readAllLines(directoryAndFile);

        for (String oneLine : fileInfo) {
            //When using bar character \\ is needed to escape its normal function
            String[] data = oneLine.split(" : ");
//            System.out.println(data[0]);
//            System.out.println(data[1]);
//            System.out.println(data);
            for (String s : data) {
//                System.out.println(s);
            }


        }

        System.out.println(fileInfo.get(2));


//        Files.write(directoryAndFile, Arrays.asList("Larry | 7", "Curly | 12", "Moe | 5", "Clifford | 15", "Fenny | 2", "Javascript | 10" ));



    }



}
