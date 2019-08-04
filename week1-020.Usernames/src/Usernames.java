
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String userName, password;
        
        System.out.print("Type your username: ");
        userName = reader.nextLine();
        System.out.print("Type your password: ");
        password = reader.nextLine();
        
        if ((userName.equals("alex") && password.equals("mightyducks")) 
                || (userName.equals("emily") && password.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }

    }
}
