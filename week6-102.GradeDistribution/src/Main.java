import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create new objects to store our grades in
        Scores grades0 = new Scores();
        Scores grades1 = new Scores();
        Scores grades2 = new Scores();
        Scores grades3 = new Scores();
        Scores grades4 = new Scores();
        Scores grades5 = new Scores();
        double accepted = 0;
        double allScores = 0;

        Scanner read = new Scanner(System.in);
        int score = 0;

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        System.out.println("Type exam score, -1 completes:");

        //Break out of loop if a -1 is entered by user
        while(score != -1){
            score = Integer.parseInt(read.nextLine());

            //Add scores to appropriate objects as long as they are between 0 and 60.
            //Increment accepted as long as score >29.
            if (score >= 0 && score <= 60) {
                if (score >= 50) {
                    grades5.addScores(score);
                    accepted++;
                } else if (score >= 45) {
                    grades4.addScores(score);
                    accepted++;
                } else if (score >= 40) {
                    grades3.addScores(score);
                    accepted++;
                } else if (score >= 35) {
                    grades2.addScores(score);
                    accepted++;
                } else if (score >= 30) {
                    grades1.addScores(score);
                    accepted++;
                } else if (score >= 0) {
                    grades0.addScores(score);
                }
                allScores++;
            }
        }

        System.out.println("Grade distribution:");
        System.out.println("5: " + grades5.printStars());
        System.out.println("4: " + grades4.printStars());
        System.out.println("3: " + grades3.printStars());
        System.out.println("2: " + grades2.printStars());
        System.out.println("1: " + grades1.printStars());
        System.out.println("0: " + grades0.printStars());
        System.out.println("Acceptance percentage: " + getAccPerc(accepted, allScores));
    }

    //Calculate the accepted percentage and return the value
    public static double getAccPerc(double accepted, double allScores){
        return 100*(accepted/allScores);
    }
}
