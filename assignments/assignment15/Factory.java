
public class Factory extends Thread{
    
    @Override
    public void run(){
        
        String[] finalproduct = {"applejuice", "Bananayorgurt", "Cherriespie", "Mangosalad", "Strawberrysmoothie"};
        for(int i = 0; i < finalproduct.length; i++ ){
            System.out.println("The Factory bought from the market and sells: "+ finalproduct[i]);
            
            // to make it thread u need to use sleep..
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
    }
    
}
