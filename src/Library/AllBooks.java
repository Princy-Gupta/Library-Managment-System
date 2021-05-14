package Library;

import java.util.ArrayList;

public class AllBooks {
    void show(ArrayList<Book> list)
    {

        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if(b.issued)
                System.out.println("Book Name- "+b.name+   ", Book Id: " + b.num  +", Book issued on- "+ b.date+", Book will be returned by "+b.returnDate);
        }
    }

    public void showAll(ArrayList<Book> list) {


        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
                System.out.println("Book Name- "+b.name+  ", Book Id: " + b.num  +", Is issued "+ b.issued+ ", Book issued on- "+ b.date+", Book will be returned by "+b.returnDate );
        }
    }
}
