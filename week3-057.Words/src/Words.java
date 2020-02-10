import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        //do until an empty string is entered
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            //Add word to arrayList
            words.add(word);

            //If entered word is empty, break from loop
            if(word.isEmpty()) break;
        }

        System.out.println("You typed the following words:");

        //Print out each word from the words ArrayList
        for(String word : words){
            System.out.println(word);
        }
    }
}
