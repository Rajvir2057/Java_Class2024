import java.util.Scanner;

public class UserRegistration {
    
    // fields that are declared..
    String name;
    String email;
    int age;
    Scanner dataentry = new Scanner(System.in);

    // formation of 2 contructors;
    public UserRegistration() {
        this.name = "Rajvir";
        this.email = "assigned123@gmail.com";
        this.age = 20;
    }
    public UserRegistration(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // setting up 2 methods;
    public void welcome(){
        System.out.println("Welcome " + name);
        System.out.println("your email is " + "\"" + email +"\"");
        System.out.println("your age is " + age);
    }

    public void Usersinput(){
        System.out.print("Enter your name please: ");
        name = dataentry.nextLine();

        System.out.print("Enter your email please: ");
        email = dataentry.nextLine();

        System.out.print("Enter your age please: ");
        age = dataentry.nextInt();

        dataentry.close();
    }
    // forming objects...
    public static void main(String[] args) {
        UserRegistration user1 = new UserRegistration();
        user1.welcome();

        UserRegistration user2 = new UserRegistration();
        user2.Usersinput();
    }
}
