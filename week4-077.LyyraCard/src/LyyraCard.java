public class LyyraCard {
    //Create object attributes
    private double balance;

    //Create object constructor
    public LyyraCard(double startingBalance){
        this.balance = startingBalance;
    }

    //Create object methods
    //Subtract 2.50 for economical lunch
    public void payEconomical(){
        if(this.balance - 2.5 >= 0)
            this.balance -= 2.5;
    }

    //Subtract 4.00 for gourmet lunch
    public void payGourmet(){
        if(this.balance - 4.0 >= 0)
            this.balance -= 4.0;
    }

    //Load a given amount of money to card as long as it's not neg
    //If balance tries to go over 150, cap it at 150
    public void loadMoney(double amount){
        if(amount > 0) {
            if (this.balance + amount < 150)
                this.balance += amount;
            else
                this.balance = 150.0;
        }
    }

    //Return entire object as a string
    public String toString(){
        return "The card has " + balance + " euros";
    }

}
