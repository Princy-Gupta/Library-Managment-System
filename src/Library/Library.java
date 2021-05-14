package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
       static ArrayList<Book> list =new ArrayList<>();;

    public static void main(String args[]) {
        preData();

            System.out.println("......................Welcome to College Library........................");
            System.out.println();

            char ch='y';
            while(ch=='y' || ch=='Y')
            {

                System.out.println("Choose the options below");
                System.out.println("Press 1 to add Book");
                System.out.println("Press 2 to issue a Book");
                System.out.println("Press 3 to return a Book");
                System.out.println("Press 4 to print details of all isssued books");
                System.out.println("Press 5 to print details of all books");
                System.out.println("Press 6 to exit");
                System.out.println("Enter Number\n");
                Scanner s = new Scanner(System.in);
                int num = s.nextInt();
                if (num == 1) {
                    AddBook book = new AddBook();
                    book.addBook(list);
                    System.out.println("If details are correct enter y else n");
                    check();
                }

                if (num == 2) {
                    IssuedBook book = new IssuedBook();
                    if(list==null)
                    {
                        System.out.println("No book is issued");
                        return;
                    }
                    book.issue(list);
                }
                if(num==3)
                {
                    if(list==null)
                    {
                        System.out.println("Empty Records");
                        return;
                    }
                    ReturnBook book= new ReturnBook();
                    book.returnB(list);
                }

                if(num==4)
                {
                    if(list==null)
                    {
                        System.out.println("Empty Records");
                        return;
                    }
                    AllBooks book= new AllBooks();
                    book.show(list);
                }

                if(num==5)
                {
                    if(list==null)
                    {
                        System.out.println("Empty Records");
                        return;
                    }
                    AllBooks book= new AllBooks();
                    book.showAll(list);

                }
                if(num==6)
                    return;

                System.out.println("do you want to perform any other function? if yes enter y else enter n");
                String str=s.next();
                ch=str.charAt(0);

            }

        }

    private static void preData() {
        Book b= new Book();
        b.name="Broken Wings";
        b.num=111;
        list.add(b);
        Book b1= new Book();
        b1.num=112;
        b1.name="My Truth";
        b1.issued=true;
        b1.date="14th May 2021";
        b1.returnDate="22nd May 2021";
        list.add(b1);
    }


    public static void check() {
                Scanner s= new Scanner(System.in);

                String check=s.nextLine();
                if(check.charAt(0)=='y' || check.charAt(0)=='Y')
                    return;
                while(check.charAt(0)=='n' || check.charAt(0)=='N')
                {
                        AddBook book= new AddBook();
                        book.addBook(list);
                        System.out.println("If details are correct enter y else n");
                        check=s.nextLine();
                }
        }
}