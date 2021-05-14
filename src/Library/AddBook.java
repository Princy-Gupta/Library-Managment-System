package Library;
import java.util.ArrayList;
import java.util.Scanner;
public class AddBook {
    Scanner s = new Scanner(System.in);

    void addBook(ArrayList<Book> list) {
        System.out.println("Enter book name");
        String bookName = s.nextLine();
        System.out.println("Enter book number");
        int bookId = s.nextInt();
        System.out.println("Entered details are ->");
        System.out.println("Book Name: " + bookName  + "\nBook Number: " + bookId);
          Book book=new Book();
          book.name=bookName;
          book.num=bookId;
           list.add(book);


    }


}