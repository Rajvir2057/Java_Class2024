import java.util.Scanner;

public class Student {
    // decalring id and string to be inherited in the object.., fields
    // these are parameters...

    private int id;                 // private restricts the methods from being used in the same class
    private String name;

    // constructors , initialse fields to a class, is a special method used to intis objects of a class/ it has the same name as the 
    // class. and has no return type.

    public Student(int id , String name){  // parameter..
        // these are fields
        this.id = id;            // this, helps to diffrientiate betwwen class fields and local variables(name) 
        this.name = name;              // name here is  a parameter/local variable..
        // this.name is  a field, to set parameters to a field
    }

    // methods 
    public void greet(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your id: ");
        id = scanner.nextInt();

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        
        scanner.close();
        System.out.println("Your id is: " + id + " " + "name is " + name);
    }

    // main method is for calling..
    public static void main(String[] args) {
        Student student = new Student(0, ""); // this is to set default values from our constructor.
        student.greet(); // call the greet method to input name and age.
    }

//  when a new object is created the constructor is automatucally called to intialize he object.
}
