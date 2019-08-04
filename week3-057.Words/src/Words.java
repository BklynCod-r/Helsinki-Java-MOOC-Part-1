import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.print("Type a text: ");
        String text = reader.nextLine();
        words.add(text);
        
        while (!(text.isEmpty())) {            
            System.out.print("Type a text: ");
            text = reader.nextLine();
            words.add(text);
            
            }
        if (text.isEmpty()) {
                System.out.println("You typed the "
                        + "following texts: ");
                for (String word : words ) {
                    System.out.println(word);
                }
        }
    }
}
