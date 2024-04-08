public class AddMethods {

    public void firstgreeting(){
        System.out.println("Good morning");
    }

    public void secondgreeting(){
        System.out.println("Good afternoon");
    }

    public void thirdgreeting(){
        System.out.println("Good evening");
    }

    public static void main(String[] args) {
        AddMethods greet = new AddMethods();
        greet.firstgreeting();
        greet.secondgreeting();
        greet.thirdgreeting();
    }
}
