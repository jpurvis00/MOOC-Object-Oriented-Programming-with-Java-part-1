
import java.util.ArrayList;

public class Menu {
    //Create object attributes
    private ArrayList<String> meals;

    //Create object constructor
    public Menu() {
        this.meals = new ArrayList<String>();
    }

    //Create object methods

    //Add new meals to the this.meal ArrayList
    public void addMeal(String meal){
        if(!this.meals.contains(meal))
            this.meals.add(meal);
    }

    //Print all meals in this.meals ArrayList
    public void printMeals(){
        for(String item : this.meals)
            System.out.println(item);
    }

    //Clear all items from the this.meal ArrayList
    public void clearMenu(){
        this.meals.clear();
    }
}
