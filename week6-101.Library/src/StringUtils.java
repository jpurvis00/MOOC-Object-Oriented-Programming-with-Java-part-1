/*
This class performs a matching operation.  We use it so that case is not
an issue and leading/trailing spaces are not an issue.
 */

public class StringUtils {
    //Object methods
    //Returns true if the searched parameter is found in the word parameter.
    //Converts all words to uppercase and removes leading/trailing whitespace.
    public static boolean included(String word, String searched){
        if(word.trim().toUpperCase().contains(searched.trim().toUpperCase()))
            return true;
        else
            return false;
    }
}
