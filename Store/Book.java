
public class Book {
    private final String ISBN;
    private String title;
    private Person author;
    private double price;
    private int quantity;

    public Book(String ISBN, String title, Person author, double price, int quantity){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%6s %20s %20s %8.2f %8d", ISBN, title, author, price, quantity);
    }

    public Person getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        Book temp = (Book) obj;
        return this.ISBN == temp.getISBN();
    }
}

