
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return checkBalance(cashGiven, 2.50, "economical");
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return checkBalance(cashGiven, 4.00, "gourmet");
    }

    /*Code for payEconomical and payGourmet was identical.  Created new method to
     *to check the balance.  Look at comments in above methods for functionality.
     */
    private double checkBalance(double cashGiven, double lunchPrice, String economicalOrGourmet){
        if(cashGiven >= lunchPrice) {
            if(economicalOrGourmet.equals("economical"))
                this.economicalSold++;
            else
                this.gourmetSold++;

            this.cashInRegister += lunchPrice;
            return cashGiven - lunchPrice;
        }
        else
            return cashGiven;
    }

    public boolean payEconomical(LyyraCard card){
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        double cBalance = card.balance();
        return payByCard(2.50, "economical", card);
    }

    public boolean payGourmet(LyyraCard card){
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        //double cBalance = card.balance();
        return payByCard(4.00, "gourmet", card);
    }

    /*Code for payEconomical and payGourmet was identical.  Created new method to
     *to pay for the meal on the card.  Look at comments in above methods for functionality.
     */
    private boolean payByCard(double lunchPrice, String economicalOrGourmet, LyyraCard card){
        if(card.balance() >= lunchPrice){
            if(economicalOrGourmet.equals("economical"))
                this.economicalSold++;
            else
                this.gourmetSold++;

            card.pay(lunchPrice);
            return true;
        }
        else
            return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum > 0){
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
