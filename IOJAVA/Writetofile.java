import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Writetofile {

    public static void main(String[] args) {

        Scanner writein = new Scanner(System.in);

        System.out.print("enter any sentence: ");
        String data = writein.nextLine();

        byte[] writeBytes = data.getBytes();

        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write(writeBytes);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}


