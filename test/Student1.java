import java.util.Scanner;

public class Student1{

    private String name;
    private int id;                 

    public Student1(String name , int id){
        this.name = name;
        this.id = id;      

    }

    // methods 
    public void greet(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your id: ");
        id = scanner.nextInt();

        scanner.close();
        System.out.println("Your id is: " + id + " " + "name is " + name);
    }

    public static void main(String[] args) {
        Student1 student = new Student1("", 0 );
        student.greet();
    }
}
