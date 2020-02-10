import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        //Do loop until empty word in entered
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            //If entered word is not empty, add to ArrayList, if it's empty, quit loop.
            if(!word.isEmpty())
                words.add(word);
            else
                break;
        }

        //Reverse the order of the ArrayList
        Collections.reverse(words);

        System.out.println("You typed the following words:");

        //Print out each word from the ArrayList.  The order should now be reversed.
        for(String word : words){
            System.out.println(word);
        }
    }
}
