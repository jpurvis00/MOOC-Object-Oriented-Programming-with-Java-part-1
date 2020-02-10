
import java.util.Scanner;

public class ReversingText {

    //Reverses the string that is passed in and returns the new word.
    public static String reverse(String text) {
        String revWord = "";

        for(int i = 0; i < text.length(); i++){
            revWord += text.charAt(text.length() - 1 - i);
        }

        return revWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
