package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class IssuedBook {
    Scanner s = new Scanner(System.in);

    void issue(ArrayList<Book> list) {

        System.out.println("Enter Book Id");
        int id = s.nextInt();
        int i=0;
        for (i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.num==id)
            {
                if( b.issued == false) {
                    b.issued = true;

                    System.out.println("Enter the date of issue");
                    s.nextLine();
                    String date = s.nextLine();
                    b.date=date;


                    System.out.println("Enter the date of return");
                    String rdate = s.nextLine();

                    b.returnDate=rdate;

                    break;

                }
                else
                {
                    System.out.println( b.name+ " is already issued, it will be back in library by "+" '"+ b.returnDate +"'");
                    break;
                }

            }

        }
        if(i==list.size())
        {
            System.out.println("Sorry there is no book with id "+ " '"+id +" '");
        }

    }
}