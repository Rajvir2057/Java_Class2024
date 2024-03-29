import java.util.Scanner;

public class Breakstatement {
    public static void main(String[] args) {
        // break in while loop;
        Scanner Break = new Scanner(System.in);

        System.out.print("Enter a number less than 10: ");
        int number = Break.nextInt();

        while(number <= 10){
            if (number == 5){
                number++;
                break; // this will break the loop
            }
            System.out.println(":) => " + number);
            number++;
        }
        System.out.print("\n");
        // this is under a for loop;

        int num = 2;

        do{
            if( num == 8){
            num++;
            break;
            }
            System.out.println(num + "it works!");
            num++;
        }while( num <= 10);
        Break.close();
    }
    
}
