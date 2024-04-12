
public class Factory {
    // declaring a simple market plan;
    protected String goods = "Toys";

    // here by protected will enable it to be accessed in other sub classes.

    public void sellingprice(){
        System.out.println("The selling price of " + goods + " is " + 100 + " dollars");
    }
    
}

class Market extends Factory{

    private void purchaseditems(){
        System.out.println("Market has  purchased " + goods);
    }
    public static void main(String[] args) {

        Market market1 = new Market();
        market1.sellingprice();
        market1.purchaseditems();
        
    }
}