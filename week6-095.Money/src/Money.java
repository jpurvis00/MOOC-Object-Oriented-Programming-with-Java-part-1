
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    //Create a new Money object with the passed in object values added to the
    //already existing values.  Return the object.
    public Money plus(Money added) {
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;
        Money newBalance = new Money(euros, cents);
        return newBalance;

        //Can combine the above two lines
        //return new Money(euros, cents);
    }

    //Checks to see if the current object values are less then the passed in object.
    //Return true if so, false if not.
    public boolean less(Money compared) {
        if(this.euros < compared.euros)
            return true;
        else if (this.euros == compared.euros) {
            if(this.cents < compared.cents)
                return true;
        }
        else
            return false;

        return false;

        //The above can be accomplished in a better way and in 1 line
        //return (100 * this.euros + this.cents) < (100 * compared.euros * compared.cents);
    }

    //Create a new Money object with the value of the original object minus the new object and return it.
    public Money minus(Money decremented) {
        int euros = 0;
        int cents = 0;

        //If cents > 0, we need to decrement it by an additional dollar.
        //ex. 10 - 8.50, 10 - 8 = 2....result should b 1.50, hence the additional dollar.
        if(decremented.cents > 0)
            euros = this.euros - decremented.euros - 1;
        else
            euros = this.euros - decremented.euros;

        //If orig objects cents < the new objects cents, add 100 to it so that our cents are properly
        //calculated.  ex. 10.20 - 8.40  -> 10.120 - 8.40 = .80
        if(this.cents < decremented.cents)
            cents = (this.cents + 100) - decremented.cents;
        else
            cents = this.cents - decremented.cents;

        //If new value is neg, set new balance to 0 dollars
        if(euros < 0) {
            euros = 0;
            cents = 0;
        }

        Money newBalance = new Money(euros, cents);
        return newBalance;

        /* Class solution which is nicer
        int euroDifference = euros - decremented.euros();
        int centDifference = cents - decremented.cents();

        if (centDifference < 0) {
            centDifference += 100;
            euroDifference--;
        }

        if (euroDifference < 0) {
            return new Money(0, 0);
        }

        return new Money(euroDifference, centDifference);
         */
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
