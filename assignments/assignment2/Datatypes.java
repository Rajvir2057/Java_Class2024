public class Datatypes{
    public static void main(String[] args){
        // The following shows how to use String data.
        String name = "Rajvir";
        String fullname = "Raj " +  "kaur";
        String stringwithnew = new String("Hello");
        // the following are examples of using int.
        int y = 3;
        int x = 4;
        int ab = 5 - 5;
        int d, u, v;
        d = u = v= 5;
        // the following shows how float can  be used.
        float myvar= 6.1f;    // float has to end with f, it can only take 5 to 6 values
        float s = 5.55f;
        float g= 4.6666f;
        // if not even double is a float that can enter 15 digits
        double data= 5.9/34.3;
        // the following shows how to use bool , this is  true/false
        boolean testing = true;
        boolean greaterorless = 4 > 10;
        boolean javaisok = false; 
        // the following shows how to use char, this reads single characters.
        char myletter = 'A';
        char ASCI= 65; //ASCII stands for the "American Standard Code for Information Interchange". 65 means A
        char ASCI2 = 65 + 75;
        // PRINTING ALL THE 15 EXAMPLES;
        System.out.println(name);
        System.out.println(fullname);
        System.out.println(stringwithnew);
        System.out.println(x + y);
        System.out.println(ab);
        System.out.println(d - u + v );
        System.out.println(myvar);
        System.out.println(s + g);
        System.out.println(data);
        System.out.println(testing);
        System.out.println(greaterorless);
        System.out.println(javaisok);
        System.out.println(myletter);
        System.out.println(ASCI);
        System.out.println(ASCI2);
    }
}