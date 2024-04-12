public class Arrays2 {

    public static void main(String[] args){
        String[] fruits = {"Apple", "Mango", "Berries", "Cherries" , "Bananas"};

        // for(int i = 0; i < fruits.length; i++){
            // System.out.println(fruits[i]);
        // } 

        // while loop..
        // int i = -1;
        // while( i < fruits.length-1){
        //     i++;
        //     if(fruits[i] == "Cherries"){
        //         continue;
        //     }
        //     System.out.println(fruits[i]);
   
        // }

        int x = 0;
        while(x < fruits.length){
            if(fruits[x].equals("Cherries")){
                x++;
                continue;
            }
            System.out.println(fruits[x]);
            x++;
    }
}
}
