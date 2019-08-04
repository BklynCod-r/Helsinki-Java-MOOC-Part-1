
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberOne, numberTwo, result;

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        numberOne = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        numberTwo = Integer.parseInt(reader.nextLine());
        
        result = numberOne + numberTwo;
        
        System.out.println("Sum of the numbers: " + result);
        
        
    }
}
