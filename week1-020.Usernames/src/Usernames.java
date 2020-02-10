
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String name = reader.nextLine();

        System.out.println("Type your password: ");
        String pw = reader.nextLine();

        if(name.equals("alex")){
            if(pw.equals("mightyducks"))
                System.out.println("You are now logged into the system!");
            else
                System.out.println("Your username or password was invalid!");
        } else if(name.equals("emily")){
            if(pw.equals("cat"))
                System.out.println("You are now logged into the system!");
            else
                System.out.println("Your username or password was invalid!");
        } else {
            System.out.println("Your username or password was invalid!");
        }


    }
}
