/* Create the class Person. It will store the persons name
and their phone number as an object.
 */

import java.util.ArrayList;

public class Person {
    //Object vars
    private String name;
    private String number;

    //Object constructors
    public Person (String name, String number) {
        this.name = name;
        this.number = number;
    }

    //Object methods
    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }

    public String toString() {
        return this.name + " number: " + this.number;
    }
}
