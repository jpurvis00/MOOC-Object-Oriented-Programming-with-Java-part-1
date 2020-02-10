import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0, count = 0, userNumb = 0, oddCount = 0, evenCount = 0;
        double average = 0;

        System.out.println("Type numbers(-1 to stop):");
        while(userNumb != -1){
            userNumb = Integer.parseInt(reader.nextLine());
            if(userNumb != -1) {
                sum += userNumb;

                if(userNumb % 2 == 0)
                    evenCount++;
                else
                    oddCount++;

                count++;
            }
            average = (double)sum / count;
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
