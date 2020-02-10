
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        Integer first = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        Integer second = Integer.parseInt(reader.nextLine());

        int sum = 0;

        for(int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println("Sum is " + sum);
    }
}
