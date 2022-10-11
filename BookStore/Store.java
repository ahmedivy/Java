package BookStore;

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

    public void printList() {
        System.out.println("==================================================================================");
        System.out.printf("%-10s%-32s%-20s%-9s  %-8s\n", "ISBN", "Title", "Author", "Price", "Quantity");
        System.out.println("==================================================================================");
        for (Book book : booksList) {
            if (book == null) {
                break;
            }
            System.out.println(book);
        }
        System.out.println("==================================================================================");
    }

    public int searchBook(String title) {
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

    public void addBook(Book book) {
        if (booksList[booksList.length - 1] != null) {
            System.out.println("Not enough space!");
        } else {
            for (int i = 0; i < booksList.length; i++) {
                if (booksList[i] == null) {
                    booksList[i] = new Book(book);
                    break;
                }
            }
        }
    }

    public void sellBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of book:");
        String title = input.nextLine();
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        input.nextLine();
        int index = searchBook(title);
        if (index == -1) {
            System.out.println("Book not found\n\n");
        } else {
            if (booksList[index].getQuantity() < quantity) {
                System.out.println("Not enough quantity!\n\n");
            } else {
                booksList[index].setQuantity(booksList[index].getQuantity() - quantity);
                double total = booksList[index].getPrice() * quantity;
                revenue += total;
                System.out.printf("Book(s) sold for Rs. %.2f\nTotal Revenue: Rs. %.2f\n\n", total, revenue);
            }
        }
    }

    public void menu() {

        int option;
        Scanner input = new Scanner(System.in);

        outer: while (true) {
            System.out.println("\n     MENU");
            System.out.println("1. Search a book");
            System.out.println("2. Sell a book");
            System.out.println("3. Print all books");
            System.out.println("4. Print revenue");
            System.out.println("5. Exit program");
            System.out.println("Select any option from the menu: ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter title of the book: ");
                    String title = input.nextLine();
                    int index = searchBook(title);
                    System.out.println(index == -1 ? "Book not found\n" : "Book is present at index " + index);
                    break;

                case 2:
                    sellBook();
                    break;

                case 3:
                    printList();
                    break;

                case 4:
                    System.out.printf("Total Revenue is Rs. %.2f\n\n", revenue);
                    break;

                case 5:
                    break outer;

                default:
                    System.out.println("Wrong Input!\n\n");
                    break;
            }
        }
        input.close();
    }
}