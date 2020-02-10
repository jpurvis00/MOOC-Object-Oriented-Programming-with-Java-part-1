
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        //if the letter has not been guessed yet
        if(!this.guessedLetters.contains(letter)){
            //If the word does not contain the letter, increase faults and
            //add letter to guessedLetters
            if(!this.word.contains(letter)) {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
            else
                this.guessedLetters += letter;
        }


        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word
        for(int i = 0; i < this.word.length(); i++){
            //We want to use the contains method but that only works comparing 2 strings.  We therefor
            //get the current char in this.word and convert it to a string with a nifty little trick
            //of "" + char.
            char c = this.word.charAt(i);
            String aString = "" + c;
            if(this.guessedLetters.contains(aString))
                hiddenWord += this.word.charAt(i);
            else
                hiddenWord += "_";
        }

        // return the hidden word at the end
        return hiddenWord;
    }
}
