
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account MyAccount = new Account("Ani's Account", 100);
        
        // Deposit $20
        MyAccount.deposit(20.00);
        
        // Final Balance
        System.out.println(MyAccount);
    }

}
