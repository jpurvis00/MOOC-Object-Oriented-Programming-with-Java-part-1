import java.util.ArrayList;

public class Team {
    //Object vars
    private String team;
    private ArrayList<Player> players;
    private int teamSize;

    //Object constructor
    public Team (String name){
        this.team = name;
        this.players = new ArrayList<Player>();
        this.teamSize = 16;
    }

    //Object methods
    public String getName() {
        return this.team;
    }

    public void addPlayer(Player person) {
        if(this.size() >= this.teamSize)
            return;

        this.players.add(person);
    }

    public void printPlayers() {
        String playerList = "";

        for(Player pers : this.players){
            System.out.println(pers.getName() + ", goals " + pers.goals());
        }
    }

    public void setMaxSize(int maxSize) {
        this.teamSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int totGoals = 0;

        for(Player pers : this.players){
            totGoals += pers.goals();
        }

        return totGoals;
    }

    public String toString(){
        //return "Team: " + this.team;
        return "Team: " + this.team + " " + this.players;
    }
}