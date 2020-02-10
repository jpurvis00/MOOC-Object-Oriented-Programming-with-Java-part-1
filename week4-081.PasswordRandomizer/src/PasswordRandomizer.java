import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String newPassword = "";

        for(int i = 0; i < this.passwordLength; i++){
            char symbol = "abcdefghijklmnopqrstuvwxys".charAt(random.nextInt(26));
            newPassword += symbol;
        }

        return newPassword;
    }
}
