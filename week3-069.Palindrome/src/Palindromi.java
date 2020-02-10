import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String revWord = "";

        //Reverse the string and store it in revWord
        for(int i = 0; i < text.length(); i++){
            revWord += text.charAt(text.length() - 1 - i);
        }

        //Check to see if the orig and new words are equal, return true if they are
        if(text.equals(revWord)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
