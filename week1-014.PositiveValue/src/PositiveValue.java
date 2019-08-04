
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        int myNum;
        
        System.out.println("Type a number: ");
        myNum = Integer.parseInt(reader.nextLine());
        
        //System.out.println("");
        if (myNum > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive");
        }
    }
}
