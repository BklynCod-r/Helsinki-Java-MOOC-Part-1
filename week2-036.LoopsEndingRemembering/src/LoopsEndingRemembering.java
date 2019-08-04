import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int result = 0;
        int counter = 0;
        int evenNum = 0, oddNum = 0;
        double average;
        
        System.out.println("Type numbers:");
        int num = Integer.parseInt(reader.nextLine());
        
        while (true) {
            counter++;
            result += num;
            average = result / (double) counter;       
            
             if (num % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
       
            System.out.println("Type numbers:");
            num = Integer.parseInt(reader.nextLine());
           
            
            if (num == -1) {
                System.out.println("Thank you and see "
                        + "you later!");
                System.out.println("The sum is " + result);
                System.out.println("How many numbers: " + counter);
                System.out.println("Average: " + average);
                System.out.println("Even Numbers: " + evenNum);
                System.out.println("Odd Numbers: " + oddNum);
                break;
            } 
        }

    }
}
