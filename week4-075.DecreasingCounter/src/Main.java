public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        //Prints initial value of 10
        counter.printValue();

        //Decreases 10 by 2 and prints 8
        counter.decrease();
        counter.decrease();
        counter.printValue();

        //Resets initial value to 0
        counter.reset();
        counter.printValue();

        //Checks that we can't decrease past 0
        counter.decrease();
        counter.printValue();

        //Returns value back to 10
        counter.setInitial();
        counter.printValue();
    }
}
