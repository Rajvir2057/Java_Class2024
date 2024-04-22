

public class Shop extends Thread{

    @Override
    public void run(){
        
        String[] shopitems = {"perfume", "books", "pens", "games", "Tables"};
        for(int i = 0; i < shopitems.length; i++ ){
            System.out.println("this is a simple shop: : "+ shopitems[i]);
            
            // to make it thread u need to use sleep..
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
    }   }
}
