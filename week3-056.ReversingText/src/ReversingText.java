
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        int i = text.length() - 1;
        String reversedText = "";
        
        while (i >= 0) {            
            char result = text.charAt(i);
            i--;
            reversedText += result;    
        }
        
        // note that method does now print anything, it RETURNS the reversed string
        return reversedText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
