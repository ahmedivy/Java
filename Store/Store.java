import java.util.Scanner;

public class Store {
    
    private Book[] booksList = new Book[500];
    private double revenue = 0;
    
    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Book[] getBooksList() {
        return booksList;
    }

    public void printList() {
        System.out.printf("%6s %20s %20s %12s %12s\n", "ISBN", "Title", "Author", "Price", "Quantity");
        System.out.println("======================================================================================");
        for (Book book : booksList) {
            if (book == null){
                break;
            }
            System.out.println(book);
        }
    }


    public int searchBook(String title){
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i] == null) {
                break;
            }
            if (booksList[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    public void addBook(String ISBN, String title,  Person author, double price, int quantity) {
        for (Book book:booksList) {
            if (book == null){
                book = new Book(ISBN, title, author, price, quantity);
                return;
            }
        }
    }

    public void sellBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of book:");
        String title = input.nextLine();
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        int index = searchBook(title);
        if (index == -1) {
            System.out.println("Book not found");;
        }
        else {
            if (booksList[index].getQuantity() < quantity){
                System.out.println("Not enough quantity!");
            }
            else {
                booksList[index].setQuantity(booksList[index].getQuantity() - quantity);
                double total = booksList[index].getPrice() * quantity;
                revenue += total;
                System.out.printf("Book(s) sold for Rs. %.2f\nTotal Revenue: Rs. %.2f", total, revenue);
            }
        }
        input.close();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        int option;

        outer: while(true) {
            System.out.println("     MENU");
            System.out.println("1. Search a book");
            System.out.println("2. Sell a book");
            System.out.println("3. Print all books");
            System.out.println("4. Print revenue");
            System.out.println("5. Exit program");
            System.out.println("Select any option from the menu: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter title of the book: ");
                    String title = input.nextLine();
                    int index = searchBook(title);
                    if (index == -1){
                        System.out.println("Book not found!");
                    }
                    else {
                        System.out.println("Book is present at index " + index + ".");
                    }
                    break;

                case 2:
                    sellBook();
                    break;

                case 3:
                    printList();
                    break;
                
                case 4:
                    System.out.printf("Total Revenue is Rs. %.2f", revenue);

                case 5:
                    break outer;
            
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
        }
        input.close();
    }
}