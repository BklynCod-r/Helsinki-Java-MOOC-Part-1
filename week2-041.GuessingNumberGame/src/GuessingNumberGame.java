
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int userNum, count = 0;

        // program your solution here. Do not touch the above lines!
        System.out.println(numberDrawn);
        
        System.out.print("Guess a number: ");
        userNum = Integer.parseInt(reader.nextLine());
       
        while (true) {
            if (userNum == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (userNum >= numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + ++count);
            } else if (userNum <= numberDrawn) {
                System.out.println("The number is greater, guess made: " + ++count);
            }
            System.out.print("Guess a number: ");
            userNum = Integer.parseInt(reader.nextLine());
        }
       
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
