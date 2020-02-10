public class Player {
    //Object vars
    private String name;
    private int numbGoals;

    //Object constructors
    public Player(String name) {
        this(name, 0);  //invokes a call to the 2nd constructor setting numbGoals to 0 since we
                              //can't specify a # in this constructors parameters
    }

    public Player(String name, int goals) {
        this.name = name;
        this.numbGoals = goals;
    }

    //Object methods
    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.numbGoals;
    }

    public String toString() {
        return "Player: " + this.name + ", goals " + this.numbGoals;
    }
}
