
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    //Calculate the difference in years
    public int differenceInYears(MyDate comparedDate) {
        if(this.earlier(comparedDate)){
            int difference = comparedDate.year - this.year;
            if(comparedDate.month < this.month || this.month == comparedDate.month && comparedDate.day < this.day)
                difference--;

            return difference;
        }
        else {
            int difference = this.year - comparedDate.year;
            if(this.month < comparedDate.month || this.month == comparedDate.month && this.day < comparedDate.day)
                difference--;

            return difference;
        }
    }
}
