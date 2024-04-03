import java.util.Scanner;

public class Student {
    // intializing , using private..
    private String name;
    private String email;
    private int age;
    Scanner scanner = new Scanner(System.in);
    
    // forming a constructor..
    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // forming methods... 
    public void name(){
        System.out.print("Enter your name please: ");
        name = scanner.nextLine();
    }

    public void email(){
        System.out.print("Enter your email please: ");
        email = scanner.nextLine();
    }
    
    public void age(){
        System.out.print("Enter your age please: ");
        age = scanner.nextInt();
    }
    public void greet(){
        System.out.println("Hello " + name + " your email is " + "\""+ email +"\""+ " and your age is " + age);
    }
    

     // using the main function to create objects..
    public static void main(String[] args) {
        Student studentdata = new Student("","",0);
        studentdata.name();
        studentdata.email();
        studentdata.age();
        studentdata.greet();
    }

}
