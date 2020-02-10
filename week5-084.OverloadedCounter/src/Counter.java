public class Counter {
    //Class obj vars
    private int value;
    private boolean check;

    //Class constructors
    //We've created 4 constructors for this class.
    //Creates an object w the value of 0 and checking turned off
    public Counter(){
        this(0, false);
    }

    //Creates an object w the value of 0 and checking toggled to user specified
    public Counter(boolean check){
        this(0, check);
    }

    //Creates an object w the user specified value and checking turned off
    public Counter(int startingValue){
        this(startingValue, false);
    }

    //Creates an object w the user specified value and checking toggled to user specified
    public Counter(int startingValue, boolean check){
        //Check has been turned on, meaning value can not be below 0
        this.value = startingValue;
        this.check = check;
    }

    //Class methods
    //Return object value
    public int value(){
        return this.value;
    }

    //Increase object value by 1
    public void increase(){
        increase(1);
    }

    //Increase object value by user specified amount
    public void increase(int increaseAmount){
        if(increaseAmount >= 0)
            this.value += increaseAmount;
    }

    //Decrease object value by 1
    public void decrease(){
        decrease(1);
    }

    //Increase object value by user specified amount
    public void decrease(int decreaseAmount){
        if(decreaseAmount >= 0) {
            if (this.check) {
                if (this.value - decreaseAmount > 0)
                    this.value -= decreaseAmount;
                else
                    this.value = 0;
            }
            else
                this.value -= decreaseAmount;
        }
    }
}
