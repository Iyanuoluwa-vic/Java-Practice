import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;



public class writingToFile {
    public static void main(String[] args) throws IOException  {

        // writing to an existing file
        FileWriter fwrite = new FileWriter("school.txt",true);
        PrintWriter outputFile = new PrintWriter(fwrite);
        outputFile.println("Name");
        outputFile.close();



        // writing to a new file
        PrintWriter otherFile = new PrintWriter("tution.txt");
        otherFile.println("James");
        otherFile.println("jdmd");
        otherFile.println("jdmd"); 
        otherFile.println("jdmd");
        otherFile.close();
        File file =new File("school.txt");
        Scanner inputFile = new Scanner(file);

        while(inputFile.hasNext()){
            String text = inputFile.nextLine();
            System.out.println(text);
        }

        inputFile.close();

    
    }
}
