public class Main {
    public static void main(String[] args) {
        Person owner = new Person("Ahmed", "Abdullah", "Male", "35404-7235834-1", "0317-9947486", new Date(2003, 06, 07));
        Address address = new Address(32, 4, "Z", "LDA", "Lahore", "Pakistan", 54000);
        Dimension dimension = new Dimension(450, 670);
        Plot plot = new Plot(owner, address, dimension, 3400000);
        System.out.println(plot);
    }
}