/**
 * A class that maintains information on a book.
 * @authors (Insert your names here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields:
    private String author;
    private String title;
    private int pages;
    private String shelfNumber;
    private int barCode;
    private boolean isAvailable;
    private int timesBorrowed;

    // Constructor
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookShelfNumber, int bookBarcode) 
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        shelfNumber = bookShelfNumber;
        barCode = bookBarcode;  
        isAvailable = true;
        timesBorrowed = 0;
    }

    // Accessor methods
    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPages()
    {
        return pages;
    }

    public String getShelfNumber()
    {
        return shelfNumber;
    }

    public int getBarcode()
    {
        return barCode;
    }

    public boolean getAvailability()
    {
        return isAvailable;
    }

    public int getTimesBorrowed()
    {
        return timesBorrowed;
    }

    public void setShelfNumber(String newShelfNumber)
    {
        shelfNumber = newShelfNumber;
    }

    public void setBarcode(int newBarcode)
    {
        barCode = newBarcode;
    }

    // Borrow a book
    public void borrowBook()
    {
        if (isAvailable) {
            isAvailable = false;
            timesBorrowed++;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    // Return a book
    public void returnBook()
    {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed!");
        }
    }
}
