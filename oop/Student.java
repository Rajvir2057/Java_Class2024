public class Student {
    
    public void studentdata(String name , int age, int classnumber){
        System.out.println("your name is" + name);
        System.out.println("your age is" + age);
        System.out.println("your are in" + "S" +classnumber);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentdata("John", 12, 1);
        student2.studentdata("Charmi", 19, 6);
    }
}
