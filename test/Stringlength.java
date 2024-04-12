import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {

        Scanner enterstring = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String sentence = enterstring.nextLine();

        System.out.println("Answer is: " + sentence.length());

        enterstring.close();
    }
}
