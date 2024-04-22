

public class Main {
    public static void main(String[] args) {
        
        Market1 items = new Market1();
        items.start();

        try {
            Thread.sleep(4500); // this is working in msec to make 1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Prices pmarket = new Prices();
        pmarket.start();

        try {
            Thread.sleep(5000); // this is working in msec to make 1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Factory products = new Factory();
        products.start();

        try {
            Thread.sleep(5000); // this is working in msec to make 1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Shop shopitems = new Shop();
        shopitems.start();

        try {
            Thread.sleep(5000); // this is working in msec to make 1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Finalmessage message = new Finalmessage();
        message.start();


    }
}
