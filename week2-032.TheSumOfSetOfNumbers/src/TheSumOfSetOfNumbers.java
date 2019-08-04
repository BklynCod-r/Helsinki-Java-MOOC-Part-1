
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num;
        int sum = 0;
        
        System.out.print("Until what? ");
        num = Integer.parseInt(reader.nextLine());
        
        int i = 0;
        while ( i <= num){
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
