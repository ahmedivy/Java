import java.util.Scanner;

public class Main {

    public static String option = "";

    public static void main(String[] args) {

        Store store = new Store();

        store.booksList[0] = new Book("345674", "CProgramming", new Author("Ch", "Deitel", "deitel@gmail.com"), 45, 12);
        store.booksList[1] = new Book("237642", "C++Programming", new Author("Ch", "Deitel", "deitel@gmail.com"), 30, 120);
        store.booksList[2] = new Book("644643", "PythonProgramming", new Author("Ch", "Deitel", "deitel@gmail.com"), 70, 102);
        store.booksList[3] = new Book("343435", "JavaProgramming", new Author("Ch", "Deitel", "deitel@gmail.com"), 500, 200);
        store.booksList[4] = new Book("868665", "JavaScriptProgramming", new Author("Ch", "Deitel", "deitel@gmail.com"), 100, 300);
        store.booksList[5] = new Book("123213", "HTMLIntro", new Author("Ch", "Deitel", "deitel@gmail.com"), 20, 20);
        store.booksList[6] = new Book("789777", "IntroToCSS", new Author("Ch", "Deitel", "deitel@gmail.com"), 35, 45);
        store.booksList[7] = new Book("456435", "TypeScript", new Author("Ch", "Deitel", "deitel@gmail.com"), 60, 12);
        
        Scanner input = new Scanner(System.in);
        
        while (option != "5"){
            System.out.println("MENU");
            System.out.println("1. Search a book");
            System.out.println("2. Sell a book");
            System.out.println("3. Print all books");
            System.out.println("4. Print revenue");
            System.out.println("5. Exit program");
            System.out.println("Select any option from the menu: ");
            option = input.nextLine();

            if (option.equals("1")){
                System.out.println("Enter title of the book: ");

                Scanner titleScan = new Scanner(System.in);

                String title = titleScan.nextLine();
            
                int index = store.searchBook(title);
                
                if (index == 0){
                    System.out.println("Book not found");
                } else {
                    System.out.println("Book is present at index " + index);
                }
            }
            if (option.equals("2")){
                System.out.println("Enter title of the book: ");
                String title = input.nextLine();

                int index = store.searchBook(title);

                if (index == 0){
                    System.out.println("Book not found");
                }
                else {
                    double newRevenue = store.getRevenue() + store.getBooksList()[index].getPrice();
                    store.setRevenue(newRevenue);
                    store.getBooksList()[index] = null;
                    System.out.println("Book has been sold");
                    
                }
            }
            else if (option.equals("3")){
                store.printList();
            }
            else if (option.equals("4")){
                System.out.println("Revenue: " + store.getRevenue());
            }

        }
    }
}
