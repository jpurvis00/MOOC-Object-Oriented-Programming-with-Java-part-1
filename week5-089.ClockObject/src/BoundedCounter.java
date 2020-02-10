
public class BoundedCounter {
    //Create object attributes/variables
    private int value;
    private int upperLimit;

    //Create object contstructor
    public BoundedCounter(int newUpperLimit){
        this.value = 0;
        this.upperLimit = newUpperLimit;
    }

    //Object methods
    //Increment value by 1 unless it will go above upperLimit.  If so, set to 0.
    public void next(){
        if(this.value < upperLimit)
            this.value++;
        else
            this.value = 0;
    }

    //Get the stored value
    public int getValue(){
        return this.value;
    }

    //Set the value of the object if it's > 0 and <= the upperLimit
    public void setValue(int newValue){
        if(newValue > 0 && newValue <= this.upperLimit)
            this.value = newValue;
    }

    //Print object as string
    public String toString(){
        if(this.value < 10)
            return "0" + this.value;
        else
            return "" + this.value;

    }
}
