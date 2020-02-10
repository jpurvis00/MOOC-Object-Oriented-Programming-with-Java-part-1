import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        Integer numb1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number: ");
        Integer numb2 = Integer.parseInt(reader.nextLine());

        if(numb1 > numb2)
            System.out.println("Greater number: " + numb1);
        else if(numb2 > numb1)
            System.out.println("Greater number: " + numb2);
        else
            System.out.println("The numbers are equal!");
    }
}
