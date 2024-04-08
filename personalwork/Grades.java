import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
        Scanner scanneddata = new  Scanner (System.in);

        System.out.print("Enter a number from 65 eg 65 prints A: ");
        int grade = scanneddata.nextInt();

        switch(grade){
            case 65:
            System.out.println("you got an: " +(char)grade);
            break;
            case 66:
            System.out.println("you got a: " + (char)grade);
            break; 
            case 67:
            System.out.println("you got a: " + (char)grade);
            break;
        }
        scanneddata.close();
    }
}
