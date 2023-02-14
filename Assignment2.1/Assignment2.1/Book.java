
/**
 * Write a description of class Book here.
 *
 * @author Eric Wallace
 * @version (a version number or a date)
 */
public class Book
{
    // Author's last name.
    private String lastName;
    // Author's first name
    private String firstName;
    // Book's ISBN.
    private String ISBN;
    // Title of the book.
    private String title;
    // Date the book was published.
    private String publicationDate;
    // Number of pages in the book.
    private int numberOfPages;
    /**
     * Constructor for objects of class Book
     */
    public Book(String lastName, String firstName, String ISBN, String title, String publicationDate, int numberOfPages)
    {
        // Construct the book.
        this.lastName = lastName;
        this.firstName = firstName;
        this.ISBN = ISBN;
        this.title = title;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
    }

    /**
     * Access the author's last name.
     *
     */
    public String getLastName()
    {
        // Retrieve the authors last name.
        return lastName;
    }
    
    /**
     * Access the author's first name.
     *
     */
    public String getFirstName()
    {
        // Retrieve the authors last name.
        return firstName;
    }
    
    /**
     * Access the book's ISBN.
     *
     */
    public String getISBN()
    {
        // Retrieve the books ISBN.
        return ISBN;
    }
    
    /**
     * Access the book's title.
     *
     */
    public String getTitle()
    {
        // Retrieve the book's title.
        return title;
    }
    
    /**
     * Access the date the book was published.
     *
     */
    public String getPublicationDate()
    {
        // Retrieve the date the book was published.
        return publicationDate;
    }
    
    /**
     * Access the number of pages in the book.
     *
     */
    public int getNumberOfPages()
    {
        // Retrieve the number of pages in the book.
        return numberOfPages;
    }
}
