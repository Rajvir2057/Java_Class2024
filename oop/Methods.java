// import java.util.Scanner;

public class Methods {
    // Scanner dataentry = new Scanner(System.in);

    public int add(int a , int b){
        return a + b;
    }

    public int sub(int c, int d){
        return c - d;
    }

    public double mult(double x , double y){
        return x*y;
    }

    public double div(double f , double h){
        return f/h;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();

        System.out.println(methods.add(2, 4));
        System.out.println(methods.sub(2, 4));
        System.out.println(methods.mult(2, 4));
        System.out.println(methods.div(2, 4));

    }
}
