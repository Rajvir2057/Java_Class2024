public class Methodoverloading {

    public void convert(int num){
        System.out.println("int num = " + num);
    }

    public void convert(long num){
        System.out.println("long num = " + num);
    }

    public static void main(String[] args) {
        Methodoverloading object1 = new Methodoverloading();

        object1.convert(12000000L);
    }
    
}
