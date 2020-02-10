public class Main {
    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(16);

        System.out.println("Team: " + barcelona.getName()); //test getName method
        //System.out.println(barcelona);  //test toString method

        Player messi = new Player("Lionel Messi"); //Test 1st constructor
        //System.out.println(messi);

        Player suarez = new Player("Luiz Suarez", 25); //Test 2nd constructor
        //System.out.println(suarez);

        barcelona.addPlayer(messi);
        barcelona.addPlayer(suarez);
        barcelona.addPlayer(new Player("Coutinho", 10));

        barcelona.printPlayers();
        System.out.println("Number of players: " + barcelona.size());
        System.out.println("Total goals: " + barcelona.goals());
    }
}
