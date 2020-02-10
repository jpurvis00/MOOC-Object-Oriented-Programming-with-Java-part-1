
public class NumberStatistics {
    //Create object attributes/variables
    private int amountOfNumbers;
    private int sum;

    //Create object constructor
    public NumberStatistics () {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    //Create object methods
    public void addNumber(int number){
        this.sum += number;
        this.amountOfNumbers++ ;
    }

    //Returns the amount of #'s entered
    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    //Sums all the #'s entered if at least 1 # is > 0
    public int sum(){
        if(this.amountOfNumbers == 0)
            return 0;
        else
            return this.sum;
    }

    //Finds the average as long as there is at least 1 # > 0
    public double average(){
        if(this.amountOfNumbers == 0)
            return 0.0;
        else
            return this.sum / (double)this.amountOfNumbers;
    }
}
