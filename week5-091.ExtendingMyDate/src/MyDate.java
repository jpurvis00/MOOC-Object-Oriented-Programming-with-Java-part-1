
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    //Advance date by 1 day, we are assuming there are only 30 days in a month
    //for this assignment
    public void advance() {
        if(this.day < 30)
            this.day++;
        else {
            this.day = 1;

            if(this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
    }

    //Advance date by give # of days
    public void advance(int numberOfDays) {
        for(int i = 0; i < numberOfDays; i++) {
            advance();
        }
    }

    //Create a new object with the same date as teh original object, increment it
    //by the # of days passed in.
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);

        newMyDate.advance(days);

        return newMyDate;
    }
}
