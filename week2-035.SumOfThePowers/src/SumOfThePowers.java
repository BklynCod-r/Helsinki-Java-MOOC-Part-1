
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
       
        int i = 0, result = 0;
        
        while (i <= num) {            
           int thing = (int) Math.pow(2, i);
           result += thing;
           i++;
        }
        
        System.out.println("The result is " + result);
    }
}
