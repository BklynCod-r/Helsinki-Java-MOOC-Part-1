
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String firstName, secondName;
        int firstAge, secondAge, totalAges;
        
        System.out.println("Type your name: ");
        firstName = reader.nextLine();
        System.out.println("Type your age: ");
        firstAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        secondName = reader.nextLine();
        System.out.println("Type your age: ");
        secondAge = Integer.parseInt(reader.nextLine());
        
        totalAges = firstAge + secondAge;
        
        System.out.println(firstName + " and " + secondName + " are "
            + totalAges + " years old in total.");
    }
}
