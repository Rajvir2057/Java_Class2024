
public class Calculater {
    // lets try declaring values and use them inside a new calculator..
    protected int x;
    protected int y;
    protected int z;
    protected int a;
    protected int b;

}

class Answers extends Calculater{
    // lets try declaring values and use them inside a new calculator..

    public int addition(int x , int y){
        return x + y;
    }

    public void subtraction(int a , int b){
        System.out.println(a - b);
    }

    public void multiplication(int a , int z){
        System.out.println(a * z);
    }

    public void division(int a , int z){
        System.out.println(a / z);
    }

    public static void main(String[] args){
        Answers object1 = new Answers();

        int result = object1.addition(10, 20);
        object1.subtraction(10, 20);
        object1.multiplication(10, 20);
        object1.division(10, 5);

        System.out.println( "the answer is: " + result);
    }
}