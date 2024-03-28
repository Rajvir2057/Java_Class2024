import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
        double a;
        double b;
        double c;

        Scanner hypotinese = new Scanner(System.in);

        System.out.print("Enter the height, (a): ");
        a = hypotinese.nextDouble();

        System.out.print("Enter the base, (b): ");
        b = hypotinese.nextDouble();


        c = Math.sqrt((a*a) + (b*b));

        System.out.println("The hypotinese is: "+ c );

        hypotinese.close();
    }
}