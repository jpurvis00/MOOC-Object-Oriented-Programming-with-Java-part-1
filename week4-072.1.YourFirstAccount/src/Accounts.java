
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account jeffAccount = new Account("Jeff P", 100.00);
        jeffAccount.deposit(20.00);
        System.out.println(jeffAccount.toString());
    }
}
