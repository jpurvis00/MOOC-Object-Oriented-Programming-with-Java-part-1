
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String secretMsg = "You rock!";

        // Write your code here
        while(true){
            System.out.println("Type the password: ");
            String enteredPW = reader.nextLine();

            if(enteredPW.equals(password)){
                System.out.println("Right!");
                System.out.println("\nThe secret is: " + secretMsg);
                break;
            } else
                System.out.println("Wrong!");
        }
    }
}
