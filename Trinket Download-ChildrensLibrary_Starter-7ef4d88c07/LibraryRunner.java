
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    for (Book kidbook : childrensBooks) {
      if (authorToFind.equals(kidbook.getAuthor())) {
        System.out.println(kidbook.getTitle());
      }
    }
    
    String bookToFind = "Sky Island";
    double minRating = 0.0;
    for (Book kidbook2 : childrensBooks) {
      if (bookToFind.equals(kidbook2.getTitle())) {
        minRating = kidbook2.getRating();
      }
    }
    //System.out.println(minRating);
    for (Book kidbook3 : childrensBooks) {
      if (kidbook3.getRating() >= minRating) {
        System.out.println("Author: " + kidbook3.getTitle() + ", Title: " + kidbook3.getAuthor());
      }
    }

    for (int i = 0; i < childrensBooks.size(); i++) {
      if (authorToFind.equals(childrensBooks.get(i).getAuthor())) {
        System.out.println(childrensBooks.get(i).getTitle());
      }
    }

  }
}