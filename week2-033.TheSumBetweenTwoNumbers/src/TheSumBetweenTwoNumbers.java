
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int first, last;
        int result = 0;
        
        System.out.print("First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        last = Integer.parseInt(reader.nextLine());
        
        while (first <= last) {
            result += first;
            first++;
        }
        
        System.out.println("The sum is " + result);
        
    }
}
