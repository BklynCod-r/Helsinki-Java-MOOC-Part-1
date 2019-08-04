
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int grade;
        System.out.println("Type the points [0-60]: ");
        grade = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        if (grade < 30) {
            System.out.println("Failed");
        } else if (grade < 35) {
            System.out.println("1");
        } else if (grade < 40) {
            System.out.println("2");
        } else if (grade < 45) {
            System.out.println("3");
        } else if (grade < 50) {
            System.out.println("4");
        } else {
            System.out.println("5");
        }
    }
}
