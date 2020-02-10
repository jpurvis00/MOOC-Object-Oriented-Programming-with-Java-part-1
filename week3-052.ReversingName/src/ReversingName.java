import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        String reverseName = "";

        for(int i = 0; i < name.length(); i++){
            reverseName += name.charAt(name.length() - i - 1);
        }

        System.out.println("In reverse order: " + reverseName);
    }
}
