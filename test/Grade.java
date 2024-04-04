import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        // intialising the grade..
        int marks = 90;
        // scanner.
        Scanner gradeinput = new Scanner(System.in );

        System.out.print("ENTER THE MARK: ");
        marks = gradeinput.nextInt();

        // using if ..
        if(marks >= 90){
            System.out.println("A");
        }
        else if (marks >= 80){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
        gradeinput.close();
    }
}
