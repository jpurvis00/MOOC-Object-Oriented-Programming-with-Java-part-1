
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        Integer numb = Integer.parseInt(reader.nextLine());

        int i = 0;
        int sum = 0;

        while(i <= numb){
            sum += i;
            i++;
        }

        System.out.println("Sum is " + sum);
    }
}
