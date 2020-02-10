
public class Accounts {

    public static void main(String[] args) {
        Account aAccount = new Account("A", 100.0);
        Account bAccount = new Account("B", 0.0);
        Account cAccount = new Account("C", 0.0);

        transfer(aAccount, bAccount, 50.0);
        transfer(bAccount, cAccount, 25.0);

        System.out.println(aAccount.toString());
        System.out.println(bAccount.toString());
        System.out.println(cAccount.toString());
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
