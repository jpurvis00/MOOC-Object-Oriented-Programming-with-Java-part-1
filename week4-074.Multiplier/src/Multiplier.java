public class Multiplier {
    //Create object attributes
    private int number;

    //Create object constructor
    public Multiplier(int newNumber){
        this.number = newNumber;
    }

    //Object methods
    public int multiply(int otherNumber){
        return this.number * otherNumber;
    }
}
