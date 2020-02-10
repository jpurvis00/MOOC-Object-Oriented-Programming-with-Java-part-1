import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers, -1 to stop:");

        int numb = 0;

        while(numb != -1){
            numb = Integer.parseInt(reader.nextLine());

            //Get the sum of all #'s
            if(numb != -1)
                sum.addNumber(numb);

            //Get the sum of even #'s
            if(numb % 2 == 0 && numb > 0)
                even.addNumber(numb);

            //Get the sum of odd #'s
            if(numb % 2 != 0 && numb > 0)
                odd.addNumber(numb);
        }

        System.out.println("sum: " + sum.sum());
        System.out.println("even: " + even.sum());
        System.out.println("odd: " + odd.sum());
    }
}
