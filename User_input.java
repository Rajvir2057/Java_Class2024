import java.util.Scanner;

public class User_input{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = Input.nextLine();
        System.out.print("Enter your age: ");
        int Age= Input.nextInt();
        System.out.println("Your name is: " + Name + ", Your age is: " + Age);
    }
}
