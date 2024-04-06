import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class writingToFile {
    public static void main(String[] args) throws IOException  {
        FileWriter fwrite = new FileWriter("school.txt",true);
        PrintWriter outputFile = new PrintWriter(fwrite);
        
        outputFile.println("Name");


    

        PrintWriter otherFile = new PrintWriter("tution.txt");
        otherFile.println("James");
        otherFile.println("jdmd");
        otherFile.println("jdmd"); 
        otherFile.println("jdmd");


        otherFile.close();
        outputFile.close();

    
    }
}
