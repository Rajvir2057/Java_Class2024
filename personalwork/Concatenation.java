public class Concatenation {
    public static void main(String[] args) {

        // using the add button..
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1 + " " + s2); // to leave space between 2 variables.

        // using the concat method..
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.concat(" "+ s2)); 
    }
}
