
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        System.out.println("the number is  " + numbers[0]);
        System.out.println("the length is  " + numbers.length);
        System.out.println("the last number is  " + numbers[numbers.length-1]);

        int max = numbers[0];

        for(int i = 0; 1 < numbers.length; i++ ){
            if(numbers[i]> max){
                max = numbers[i];
            }
            System.out.println( "max stuff is"+ max);
        }

    }
}
