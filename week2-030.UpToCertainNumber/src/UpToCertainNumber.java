
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int countNum = 1;
        int num;
        
        System.out.print("Up to what number? ");
        num = Integer.parseInt(reader.nextLine());
        
        while (countNum <= num) {            
            System.out.println(countNum);
            countNum++;
        }
        
    }
}
