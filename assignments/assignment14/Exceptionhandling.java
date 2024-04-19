import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader;

public class Exceptionhandling{

    public static void main(String[] args) {

            // using scanner to seek input..
    Scanner input = new Scanner(System.in);

    try { 
        System.out.println("Enter any sentence: ");

        String sentence = input.nextLine();
        char testing = sentence.charAt(24); // getting the 25th element
        System.out.println(testing); 
    } 
    catch(StringIndexOutOfBoundsException e) { 
        System.out.println("StringIndexOutOfBoundsException"); 
    } 

    //file missing..

        try { 
            File samplefile = new File("example2.txt"); 
  
            FileReader fr = new FileReader(samplefile); 
        } 
        catch (FileNotFoundException e){ 
           System.out.println("File does not exist!"); 
        } 
    }

}











// printStackTrace()
// This method prints exception information in the format
// of the Name of the exception: description 
// of the exception, stack trace.