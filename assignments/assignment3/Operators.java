public class Operators{
    public static void main(String[] args){
        //Arithmetic operators.
        int x = 5;
        int y = 8;

        //unary operators.
        int num= 4;
        num = -num;
    
        boolean condition = true;
        int num3 = 6;

        // Assignment operators,
        String name = "RajVir";

        int e = 3;
        int g = 6;
        int answer = e += g;

        // relational operators 
        int k = 5;
        int j=  26;
        int l = 5;

        //logical
        int a = 10, b = 20, c = 20, d = 0;

        if ((a < b)&&(a == c)){
            d = a - b + c;
            System.out.println(d);
        }
        else
            System.out.println("false");

        System.out.println("The added value is: " + (x+y));
        System.out.println("The modulus value is: " + (x%y));
        System.out.println(num);
        System.out.println(condition);
        System.out.println(!(num3 == 0));
        System.out.println(answer);
        System.out.println(k>j);
        System.out.println(k==l);
    }
}