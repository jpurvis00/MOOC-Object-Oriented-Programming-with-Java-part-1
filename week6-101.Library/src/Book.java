/*
This class creates a Book object containing the book title, publisher
and year it was published.  We are only providing the basic setters, getters
and toString.
 */

public class Book {
    //Object attributes/vars
    private String title;
    private String publisher;
    private int year;

    //Object constructors
    public Book(String title, String publisher, int year){
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    //Object methods
    //Return book title
    public String title(){
        return this.title;
    }

    //Return book publisher
    public String publisher() {
        return this.publisher;
    }

    //Return book year
    public int year() {
        return this.year;
    }

    //Display book object in string format
    public String toString(){
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
