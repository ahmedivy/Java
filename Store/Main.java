public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        // Adding some books
        Person deitel = new Person("Paul", "Deitel", "paul@deitel.com");
        Person harvey = new Person("Harvey", "Deitel", "harvey@deitel.com");
        store.addBook("345674", "C Programming", harvey, 45, 12);
        store.addBook("237642", "C++ Programming", deitel, 30, 120);
        store.addBook("644643", "Python Programming", harvey, 70, 102);
        store.addBook("343435", "Java Programming", harvey, 500, 200);
        store.addBook("868665", "JavaScript Programming", deitel, 100, 300);
        store.addBook("123213", "HTML Intro", harvey, 20, 20);
        store.addBook("789777", "Intro to CSS", deitel, 35, 45);
        store.addBook("456435", "Move to TypeScript", deitel, 60, 12);
        
        store.menu();
        return;
    }
}
