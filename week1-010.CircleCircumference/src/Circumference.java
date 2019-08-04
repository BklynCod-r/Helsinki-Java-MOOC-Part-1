
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        int userRadius;
        
        System.out.println("Type the radius: ");
        userRadius = Integer.parseInt(reader.nextLine());
        
        System.out.println("Circumference of the circle: " + (2 * Math.PI * userRadius));
    }
}
