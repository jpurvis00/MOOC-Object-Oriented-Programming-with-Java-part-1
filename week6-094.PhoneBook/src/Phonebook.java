/* Create the class Phonebook. It will store an ArrayList of Person
objects.
 */

import java.util.ArrayList;

public class Phonebook {
    //Object vars
    private ArrayList<Person> list;

    //Object constructor
    public Phonebook() {
        //Create and new ArrayList storing the Person object in it
        this.list = new ArrayList<Person>();
    }

    //Object methods
    //Create a new Person object with the name and number.  Add that Person object
    //to the list ArrayList
    public void add(String name, String number) {
        Person person = new Person(name, number);
        list.add(person);

        //We can combine the above two lines
        //list.add(new Person(name, number));
    }

    //Print all the people in the Phonebook
    public void printAll() {
        for(Person person : this.list) {
            System.out.println(person);
        }
    }

    //Search the Phonebook for a name and return their phone number
    public String searchNumber(String name) {
        //Iterate through each person object in the list ArrayList
        for(Person person : this.list) {
            //If you name's are a match, return the phonenumber.  If no match, return error string.
            if(person.getName().equals(name))
                return person.getNumber();
        }

        //Name was not found in the ArrayList
        return "number not known";
    }
}
