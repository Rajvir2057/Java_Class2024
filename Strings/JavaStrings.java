import java.util.Scanner;

public class JavaStrings {
    public static void main(String[] args) {
        // string length..
        Scanner len = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string1 = len.next();

        System.out.println("The length of the string is: " + string1.length());
    }
    
}
