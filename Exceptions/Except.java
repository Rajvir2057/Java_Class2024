import java.util.Scanner;

public class Except {

    public static void main(String[] args) {
        // using scanner..

        Scanner input = new Scanner(System.in);

        System.out.println("division..");

        try{

            System.out.print("Enter the first number: ");
            double num1 = input.nextInt();
    
            System.out.print("Enter the second number: ");
            double num2 = input.nextInt();
    
            double division = num1 / num2;

            System.out.println("your answer is: " + division);

            if(num1 < 0 && num2 < 0){
                throw new IllegalArgumentException("do not use a negative pls");
            }
        }
        catch(ArithmeticException e){
            System.out.println("the answer cannot be divided by" + e.getMessage());
        }
    }
    
}
// jdk installs JVM AND JRE