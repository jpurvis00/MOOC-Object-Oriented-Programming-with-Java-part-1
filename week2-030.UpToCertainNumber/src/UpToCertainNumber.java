
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number? ");
        Integer numb = Integer.parseInt(reader.nextLine());
        Integer counter = 1;

        while(counter <= numb){
            System.out.println(counter);
            counter++;
        }
    }
}
