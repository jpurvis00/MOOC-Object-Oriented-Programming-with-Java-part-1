/*
This class creates a bird object storing the birds name, latin name and how many
times the bird has been observed.
 */

public class Bird {
    //Object attributes/vars
    private String name;
    private String latinName;
    public int observations;

    //Object contructors
    public Bird(String name, String latin){
        this.name = name;
        this.latinName = latin;
        this.observations = 0;
    }

    //Object methods
    //Increase by 1
    public void increaseObservations(){
        this.observations++;
    }

    //Returns how many times the bird has been observed
    public int getObservations(){
        return observations;
    }

    //Returns the birds name
    public String getName(){
        return this.name;
    }

    //Returns the birds latin name
    public String getLatinName(){
        return this.latinName;
    }

    //Returns a string format of the object
    public String toString(){
        return this.name + " (" + this.latinName + ")";
    }
}
