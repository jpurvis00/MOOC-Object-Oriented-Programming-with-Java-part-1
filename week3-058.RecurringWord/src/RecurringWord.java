
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        //Do loop until a word has been entered 2x
        while(true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            //If the words ArrayList does not contain the entered word, add it to the
            //ArrayList.  If it does exist, print error msg and leave loop.
            if (!words.contains(word))
                words.add(word);
            else {
                System.out.println("You gave the word " + word + " twice");
                break;
            }
        }
    }
}
