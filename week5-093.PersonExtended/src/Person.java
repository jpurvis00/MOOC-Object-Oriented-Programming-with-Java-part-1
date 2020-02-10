import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private int currentDay = Calendar.getInstance().get(Calendar.DATE);
    private int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(currentDay, currentMonth, currentYear);
    }
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        MyDate todaysDate = new MyDate(currentDay, currentMonth, currentYear);
        return birthday.differenceInYears(todaysDate);
    }

    /* I made the following method too complicated.  I could have easily just cut it down
    to use the MyDate earlier() method this one line.

    return this.birthday.earlier(compared.birthday);
     */
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if(this.age() > compared.age())
            return true;
        //If the years are the same, see which birthday is earlier
        else if(this.age() == compared.age()) {
            if(this.birthday.earlier(compared.birthday))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}