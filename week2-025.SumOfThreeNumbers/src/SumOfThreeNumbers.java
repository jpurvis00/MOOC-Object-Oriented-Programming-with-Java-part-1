
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read
        for(int i = 0; i < 3; i++){
            System.out.println("Type the number: ");
            sum += Integer.parseInt(reader.nextLine());
        }

        System.out.println("Sum: " + sum);
    }
}
