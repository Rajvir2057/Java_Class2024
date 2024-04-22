

public class Prices extends Thread{
    
    @Override
    public void run(){
        int[] prices = {5000, 6000, 8000, 9000, 3000};
        for(int i = 0; i < prices.length; i++){
            System.out.println("The price of the item is: "+prices[i]);
        }
    }
    
}
