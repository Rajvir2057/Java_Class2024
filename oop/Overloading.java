
public class Overloading {
    // initial

    String name;
    int age;
    

    // contructors,
    public Overloading(String name){
        this.name = name;
    }

    public Overloading(int age){
        this.age = age;
    }

    // methods
    public static void main(String[] args){
        Overloading overloading = new Overloading("John");
        Overloading overloading2 = new Overloading(15);
        
        System.out.println(overloading);
        System.out.println(overloading2);
    }

}
