import java.util.Scanner;

public class Dowhileloop{
    public static void main(String[] args) {
        // this is the third example using input..
        Scanner dowhile = new Scanner(System.in);

        System.out.print("\'Enter the First number to begin the loop\': ");
        int num1 = dowhile.nextInt();

        System.out.print("\'Enter the a number greater than num1 to end the loop\': ");
        int num2 = dowhile.nextInt();

        do{
            System.out.println("loop "+ num1);
            num1 ++;
        }
        while(num1 <= num2);

        // here its a decrement loop.. :)
        System.out.print("Enter a number greater than 1 please:) => ");
        int num3 = dowhile.nextInt();
        dowhile.nextLine();

        System.out.print("Enter any string eg, hello ot times up: ");
        String sentence = dowhile.nextLine();

        do{
            System.out.println(num3);
            num3--;
        }while (num3 >= 1);
        System.out.println(sentence);
        // this adding then looping... 

        System.out.print("\'Enter the First number to begin the loop\': ");
        int num4 = dowhile.nextInt();

        System.out.print("\'Enter the a number greater than num1 to end the loop\' 2: ");
        int num5 = dowhile.nextInt();


        do{
            int addedvalue = num4 + 1 ;

            System.out.println(" looped value "+ num4 + " then added value => " + addedvalue );
            num4 ++;
        }
        while(num4 <= num5);
        dowhile.close();
    }
}
