
import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner loop = new Scanner(System.in);

        System.out.print("Enter a number than you want to loop from. ");
        int number1 = loop.nextInt();

        System.out.print("Enter the second number greater than number 1. ");
        int number2 = loop.nextInt();

        while (number1 <= number2) {
            System.out.println("The looped answer is " + number1);
            number1++;
        }   
        loop.close();
    }
}
