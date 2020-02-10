/*
Class creates an object of scores stored in an ArrayList.
 */

import java.util.ArrayList;

public class Scores {
    //Object attributes/vars
    private ArrayList<Integer> scores;

    //Object constructors
    public Scores(){
        //Create an instance of the ArrayList
        this.scores = new ArrayList<Integer>();
    }

    //Object methods
    //Add the score to the ArrayList
    public void addScores(int score){
        this.scores.add(score);
    }

    //Concactenates a string of * as long as the size of the ArrayList and returns it as a String.
    public String printStars(){
        String stars = "";
        for(int i = 0; i < this.scores.size(); i++){
            stars += "*";
        }
        return stars;
    }

    //Returns the ArrayList contents
    public String toString(){
        return this.scores.toString();
    }
}
