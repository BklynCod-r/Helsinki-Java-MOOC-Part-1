import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Type the first number: ");
        num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.println("Type the second number: ");
        num2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        if (num1 > num2) {
            System.out.println("Greater number: " +
                    num1);
        } else if (num2 > num1) {
            System.out.println("Greater number: " +
                    num2);
        } else if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Somesing wrong over here");
        }

    }
}
