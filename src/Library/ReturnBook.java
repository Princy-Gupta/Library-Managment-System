package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBook {
    Scanner s = new Scanner(System.in);
    void returnB(ArrayList<Book> list)
    {
        System.out.println("Enter Book Name");
        int id = s.nextInt();
        int i=0;
        for (i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.num==id) {
                if (b.issued)
                {
                    b.issued = false;

                    b.date ="";
                    b.returnDate ="";
                    break;

                }

            }
        }
        if(i==list.size())
        {
            System.out.println("Sorry there is no book with id "+ id);
        }

    }
}
