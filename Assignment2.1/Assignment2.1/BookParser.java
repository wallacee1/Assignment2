/**
 * Book parser.
 *
 * @author Eric Wallace
 * @version 1.0
 */
public class BookParser
{
    private Book book;
    
    public BookParser(Book book){
        this.book = book;
    }
    
    public void printBooks()
    {
                System.out.println("Title: " + book.getTitle());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Author: " + book.getFirstName() + " " + book.getLastName());
                System.out.println("Publish Date: " + book.getPublicationDate());
                System.out.println("Number of Pages: " + book.getNumberOfPages());
                if (book.getNumberOfPages() < 10){
                    System.out.println("Error, number of pages is less than 10.");
                }
    }
}
