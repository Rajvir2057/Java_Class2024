import java.util.Scanner;

interface Student{
    String Uniname = "Rajvir University";
    void welcomeStudent();
    void studentinfo();
    void enteringClass();
}
class Universitystudent implements Student{

    private String name;
    private int age;
    private int UACEresults;
    private String email;

    Universitystudent(String name, int age, int UACEresults,String email){
        this.name = name;
        this.age = age;
        this.UACEresults = UACEresults;
        this.email = email;
    }

    @Override
    public void welcomeStudent() {
        System.out.println("Welcome "+name);
    }

    @Override
    public void studentinfo() {

        System.out.println("The student is called: " + name);
        System.out.println("The student's age is: " + age);
        System.out.println("The student's UACE results are:  " + UACEresults+ " /20");
        System.out.println("The student's email is: " + email);

        if(UACEresults <= 10){
            System.out.println("The student  fairly passed the UACE");
        }
        else if(UACEresults >= 14){
            System.out.println("The student passed the UACE");
        }
        else{
            System.out.println("The student failed the UACE");
        } 
    }
    @Override
    public void enteringClass() {
        System.out.println(name + " is entering  class B");
    }
    
} 
public class University {
    public static void main(String[] args) {

        Scanner dataentry = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = dataentry.nextLine();

        System.out.println("Enter your age: ");
        int age = dataentry.nextInt();

        System.out.println("Enter your UACE results: ");
        int UACEresults = dataentry.nextInt();
        
        dataentry.nextLine();

        System.out.println("Enter your email: ");
        String email = dataentry.nextLine();

        dataentry.close();

        Universitystudent student = new Universitystudent(name, age, UACEresults, email);
        student.welcomeStudent();
        student.studentinfo();
        student.enteringClass();
        System.out.println("Best of luck in your future from : " + Student.Uniname);
    }
}
