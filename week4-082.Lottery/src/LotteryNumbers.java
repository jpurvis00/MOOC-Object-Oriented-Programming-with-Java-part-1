import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i = 1;

        //Continue creating random #'s until there are 7 non repeating numbers in the ArrayList.
        while(i <= 7){
            int drawnNumb = this.random.nextInt(39) + 1;
            if(!containsNumber(drawnNumb)) {
                this.numbers.add(drawnNumb);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(this.numbers.contains(number))
            return true;
        else
            return false;
    }
}
