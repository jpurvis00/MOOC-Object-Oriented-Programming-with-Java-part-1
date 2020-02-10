/*
This class creates an ArrayList to store all the bird objects that have been
created in.
 */

import java.util.ArrayList;

public class Database {
    //Objects attributes/vars
    //Stores all bird objects
    private ArrayList<Bird> birds;

    //Object constructors
    public Database(){
        this.birds = new ArrayList<Bird>();
    }

    //Object methods
    //Adds a bird object to the db object ArrayList
    public void addBird(Bird bird){
        this.birds.add(bird);
    }

    //Checks to see if the passed in name exists as a bird object.  If so, increase the
    //bird.obersvations var by 1.  If we don't find that name, print error msg.
    public void observation(String name){
        int count = 0;

        for(Bird bird : this.birds){
            if(bird.getName().equals(name)) {
                bird.increaseObservations();
                break;
            }
            count++; //Increment count if name was not found
        }

        //If count = this.birds.size then it means we could not find that name in any of the
        //bird object stored in the db arrayList
        if(count == this.birds.size())
            System.out.println("Is not a bird!");
    }

    //If found, returns the bird objects information
    public String show(String name){
        for(Bird bird : this.birds){
            if(bird.getName().equals(name)) {
                return bird.getName() + " (" + bird.getLatinName() + ")" + " : " + bird.getObservations() + " observations";
            }
        }
        return "Name not found!";
    }

    //Prints out all objects in the db ArrayList
    public void statistics(){
        for(Bird bird : this.birds){
            System.out.println(bird + " : " + bird.getObservations() + " observations");
        }
    }

}
