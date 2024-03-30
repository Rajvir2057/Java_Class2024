import java.util.Scanner;
// this wil let a user to input 2 numbers that will add up;
public class Addition{
    public static void main(String[] args){
        Scanner addition = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int add1 = addition.nextInt();

        System.out.print("Enter the second number: ");
        int add2 = addition.nextInt();

        int sum = add1 + add2;

        System.out.println("The sum of "+ add1 + " and "+ add2 + " is = "+ sum );
        addition.close();
    }
}