import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public class FirstCharacters {
    
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
    
    public static char secondCharacter(String text) {
        return text.charAt(1);
    }
    
    public static char thirdCharacter(String text) {
        return text.charAt(2);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if (name.length() < 3) {
            System.out.println("");
        } else {
            System.out.println("1. character: " 
                    + firstCharacter(name));
            System.out.println("2. character: " 
                    + secondCharacter(name));
            System.out.println("3. character: " 
                    + thirdCharacter(name));
        }
        
    }
}
