

public class Market1 extends Thread{

    @Override
    public void run(){
    
        String[] fruits = {"Apples", "Banana", "Cherries", "Mangoes", "Strawberry"};
        for(int i = 0; i < fruits.length; i++ ){
            System.out.println("The Market sells: "+fruits[i]);
    
            // to make it thread u need to use sleep..
    
            try {
                Thread.sleep(1000); // this is working in msec to make 1
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
