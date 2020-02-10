
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]:");
        Integer grade = Integer.parseInt(reader.nextLine());

        if(grade <= 29 && grade >= 0)
            System.out.println("Grade: failed");
        else if(grade <= 34)
            System.out.println("Grade: 1");
        else if(grade <= 39)
            System.out.println("Grade: 2");
        else if(grade <= 44)
            System.out.println("Grade: 3");
        else if(grade <= 49)
            System.out.println("Grade: 4");
        else if(grade <= 60)
            System.out.println("Grade: 5");
        else
            System.out.println("Grade does not exist");
    }
}
