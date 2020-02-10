/*
This class stores all book objects in an ArrayList called catalog.  We are
creating a Library of book objects.  We are also providing ways to search
through the Library for book containing words in titles, publishers or by years.
 */

import java.util.ArrayList;

public class Library {
    //Object attributes/vars
    private ArrayList<Book> catalog;

    //Object constructor
    public Library(){
         this.catalog = new ArrayList<Book>();
    }

    //Object methods
    //Adds a book object to the catalog ArrayList
    public void addBook(Book newBook){
        this.catalog.add(newBook);
    }

    //Prints all the book objects in the catalog ArrayList
    public void printBooks(){
        for(Book book : this.catalog){
            System.out.println(book);
        }
    }

    /*Searches through the catalog ArrayList for the passed in title to see if any of
      the book titles contain that word or phrase.  If it does contain, store matching
      results in a new ArrrayList and return the ArrayList
    */
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> matchedTitles = new ArrayList<Book>();

        for(Book book : this.catalog){
            if(StringUtils.included(book.title(), title))
                matchedTitles.add(book);
        }

        return matchedTitles;
    }

    /*Searches through the catalog ArrayList for the passed in publisher to see if any of
      the book publishers contain that word or phrase.  If it does contain, store matching
      results in a new ArrrayList and return the ArrayList
    */
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> matchedPublisher = new ArrayList<Book>();

        for(Book book : this.catalog){
            if(StringUtils.included(book.publisher(), publisher))
                matchedPublisher.add(book);
        }

        return matchedPublisher;
    }

    /*Searches through the catalog ArrayList for the passed in year to see if any of
       the book years contain that word or phrase.  If it does contain, store matching
       results in a new ArrrayList and return the ArrayList
     */
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> matchedYear = new ArrayList<Book>();

        for(Book book : this.catalog){
            if(book.year() == year)
                matchedYear.add(book);
        }

        return matchedYear;
    }
}
