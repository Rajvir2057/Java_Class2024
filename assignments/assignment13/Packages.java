
import java.util.Scanner;
import static java.lang.Math.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.*;

class Mathpackage{
    // using the math pacakge..
    double num1;
    double num2;

    Scanner dataentry = new Scanner(System.in);

    public Mathpackage(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void mathPackagedata(){

        System.out.print("Enter the first number: ");
        num1 = dataentry.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = dataentry.nextDouble();

        dataentry.close();
    }

    public double sinMethod(){
        return Math.sin(num1);
    }

    public double cosMethod(){
        return Math.cos(num1);
    }

    public double squarerootMethod(){
        return Math.sqrt(num2);
    }
    
}

class Datetimepackage{
    // using the datetime pacakge..
    LocalTime  time= LocalTime.now();
    LocalDate date = LocalDate.now();

}

class Awtpacakge{
    // this is used for graphics(GUI)
    public void awtExample(){
        Frame frame1 = new Frame();

        Label mylabel = new Label("Welcome, hows life going..");

        frame1.add(mylabel);
        frame1.setSize(300, 300);
        frame1.setVisible(true);

    }
}

public class Packages {
    public static void main(String[] args) {
        Mathpackage math1 = new Mathpackage(0, 0);

        // to seek input;
        math1.mathPackagedata();
        System.out.println("the answer for sin() is " + math1.sinMethod());
        System.out.println("the answer for cos() is  " + math1.cosMethod());
        System.out.println("the answer for square root is +> " + math1.squarerootMethod());

        // for date n time..
        Datetimepackage datetime1 = new Datetimepackage();
        System.out.println("the time now => " + datetime1.time);
        System.out.println("the day now =>  " + datetime1.date);

        // for graphics..
        Awtpacakge awt1 = new Awtpacakge();
        awt1.awtExample();
    }
}
// scanner is already a package so the example is used with math together..