package BookStore;

public class BookTest {
    public static void main(String[] args) {

        Store store = new Store();

        // Adding some books
        Person deitel = new Person("Paul", "Deitel", "paul@deitel.com");
        Person harvey = new Person("Harvey", "Deitel", "harvey@deitel.com");
        store.addBook(new Book("345674", "C Programming", harvey, 45, 12));
        store.addBook(new Book("237642", "C++ Programming", deitel, 30, 120));
        store.addBook(new Book("644643", "Python Programming", harvey, 70, 102));
        store.addBook(new Book("343435", "Java Programming", harvey, 500, 200));
        store.addBook(new Book("868665", "JavaScript Programming", deitel, 100, 300));
        store.addBook(new Book("123213", "HTML Intro", harvey, 20, 20));
        store.addBook(new Book("789777", "Intro to CSS", deitel, 35, 45));
        store.addBook(new Book("456435", "Move to TypeScript", deitel, 60, 12));
        store.addBook(new Book("473382", "Data Science with R", deitel, 290, 38));
        store.addBook(new Book("123238", "Automate with Python", harvey, 350, 120));
        store.addBook(new Book("123034", "Learn ML with TensorFlow", deitel, 400, 50));
        
        store.menu();
    }
}
