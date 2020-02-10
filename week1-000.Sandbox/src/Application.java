// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        for(int i = 0; i < 3; i++){
            System.out.println("Type the number: ");
            sum += Integer.parseInt(reader.nextLine());
        }

        System.out.println("Sum: " + sum);
    }
}
