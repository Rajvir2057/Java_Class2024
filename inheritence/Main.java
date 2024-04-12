
 class Person {

    // declare 
    String name;
    int age;
    double salary;

    // constructor..
    public Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    // using this. in a method..
    // protected void setName(String name){
    //     this.name = name;
    // }

    // protected void setAge(int age){
    //     this.age = age;
    // }

    protected void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}
// using the parent class atrributes and method in the child class.

class Student extends Person{

    // declare fields for the child;
    private String name1;

    // constructor for child and to inherit we are using super keyword...
    public Student( String name1, String name, int age, double salary){
        super(name, age, salary);
        this.name1 = name1;
    }

    // using this. in a method..
    // protected void setName(String name)

    public void studentdisplayInfo(){
        displayInfo();
        System.out.println("Student Name: " + name1);
    }

}

public class Main{

    public static void main(String[] args) {
        Student student = new Student("John","fred",20,500.45);
        student.studentdisplayInfo();
    }
}