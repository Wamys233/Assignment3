/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Library
{
    private Book[] bookCollection;
    private int collectionSize;
    private String address;
    private String openingHours;

    // Constructor for objects of class Library
    public Library(String adr)
    {
        address = adr;
        bookCollection = new Book[500];
        collectionSize = 0;
        openingHours = " 9:00 - 21:00 "; //all libraries have the same hours
    }
    // Add a book to the library collection
    public void addBook(Book book)
    {
        // put your code here
    }
    
        // add your code here
    
}
