public class multidimensionalarrays {

    public static void main(String[] args) {

        // u need 3 for 3 dimenstional..

        int [][][] arrays ={{{1,2,3},{4,5,6},{7,8,9}}};

        for(int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                for(int c = 0; c < arrays[i][j].length; c++){
                    System.out.print(arrays[i][j][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
