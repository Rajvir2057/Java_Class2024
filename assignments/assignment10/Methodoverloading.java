public class Methodoverloading{

    // here method overloading is applied by changing the number of arguments.
    public int additionMethod(int x , int y){
        return x + y;
    }
    public int additionMethod(int x , int y, int z){
        return x + y + z;
    }

    // here data type is changed..
    public int subtractionMethod(int a , int b){
        return a - b;
    }
    public double subtractionMethod(double a , double b, double d){
        return a - b;
    }
    // order of parameters..
    public void humanIdentity(String name , int age){
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {
        // forming objects
        Methodoverloading add = new Methodoverloading();
        Methodoverloading sub = new Methodoverloading();
        Methodoverloading student = new Methodoverloading();

        // calling methods
        System.out.println(add.additionMethod(10, 20));
        System.out.println(add.additionMethod(10, 20, 30));
        System.out.println(sub.subtractionMethod(10, 20));
        System.out.println(sub.subtractionMethod(10.1, 20.5, 3.6));
        student.humanIdentity("Sonia", 20);
    }
}