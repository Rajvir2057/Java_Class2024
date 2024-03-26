import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner whileloop = new Scanner(System.in);

        System.out.print("Enter a number less than 10. ");
        int number1 = whileloop.nextInt();

        while (number1 <= 10){
           int  number2 = number1 + 1;
           System.out.println("The number " + number1 + " was added by 1 "+ " new answer is " + number2); 
           number1++;
        }

        System.out.print("Enter a number greater than 10: ");
        int num1 = whileloop.nextInt();

        while (num1 <= 10){
            System.err.println("looped from 1 to 10: " + num1);
            num1++;
         }
        

    }
}
