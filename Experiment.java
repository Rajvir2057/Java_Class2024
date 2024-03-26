import java.util.Scanner;

public class Experiment{
    public static void main(String[] args){
        int x = 2;
        int y = 5;

        String firstname = "Rajvir ";
        String secondname = "Kaur";
        String fullname =  firstname + secondname;

        System.out.println( x + y );
        System.out.println(fullname);

        Scanner whileloop = new Scanner(System.in); 
        
        System.out.print("Enter a number from 65: ");
        int ASCI = whileloop.nextInt(); 

        if (ASCI >= 65 && ASCI <= 127) {
            while (ASCI <= 127) { 
            System.out.println("The answer will input a letter. :): " + (char)ASCI); 
            ASCI++; 
            }
        } else {
            System.out.println("Please enter a number from 65 to 90.");
        }
        whileloop.close();
    }
}
