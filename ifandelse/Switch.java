import java.util.Scanner;

public class Switch { 

    public static void main(String[] args) {

        Scanner ageinput = new Scanner(System.in);    

        System.out.print("Enter your age please: ");
        int age = ageinput.nextInt();

        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Infant");
            break;
            case 30:
            case 40:
            case 50:
            System.out.println("youth");
            break;
            case 60:
            case 70:
            System.out.println("Old");
        }
    }
// it does not support range based cases or conditions...

}
