
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int age;
        
        System.out.println("How old are you? ");
        age = Integer.parseInt(reader.nextLine());
                
        System.out.println("");
        
        if ((age >= 0 && age <= 120)) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
