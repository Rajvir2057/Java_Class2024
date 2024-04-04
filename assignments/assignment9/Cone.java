import java.util.Scanner;

public class Cone {
    // setting up the variables..
    double radius;
    double height;
    Scanner scanner = new Scanner(System.in);

    // forming constructors..
    // defualt constructor..
    public Cone() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    // parameterised constructors
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // forming methods..
    public void scannedinput(){
        System.out.print("Enter your radius please: ");
        radius = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter your height please: ");
        height = scanner.nextDouble();
    }

    // calculation mathods
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
    
    public double calculateArea() {
        return Math.PI *(radius *(radius + height));
    }

    // main method to form objects..
    public static void main(String[] args) {
        Cone cone1 = new Cone();
        Cone cone2 = new Cone();

        cone2.scannedinput();

        // calculating the area and volume..
        double area2= cone2.calculateArea();
        double volume2 = cone2.calculateVolume();
        System.out.printf("the area is %f \n" , area2);
        System.out.printf("the volume is %f \n" , volume2);

    }
}
