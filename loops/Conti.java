public class Conti{
    public static void main(String[] args) {
      int  i = 0;

        while(i < 5){
            i++;
            if(i == 2){
                continue; // this is the logic..
            }
            System.out.println(i);
           
        }

        // nested loops
        for(int a=0; a < 10 ; a++ ){
            for(int b = 0; b< 10; b++){
                if(b%2 ==0){
                    continue;
                }
                System.out.println(a + " , " + b);
            }
        }

    }
    
}
