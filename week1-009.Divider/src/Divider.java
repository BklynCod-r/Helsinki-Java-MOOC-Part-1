
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double num1, num2, result;

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        num1 = Double.parseDouble(reader.nextLine());
        System.out.println("Type another number: ");
        num2 = Double.parseDouble(reader.nextLine());
        
        result = (num1 / num2);
        
        System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
    }
}
