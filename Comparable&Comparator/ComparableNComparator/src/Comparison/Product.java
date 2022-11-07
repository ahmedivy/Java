package Comparison;

import java.time.LocalDate;
import java.util.Comparator;

public class Product implements Comparable<Product>{
    private String name;
    private int price;
    private double rating;
    private LocalDate date;

    public Product(String name, int price, double rating, LocalDate date) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.date = date;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareToIgnoreCase(o.getName());
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", rating=" + rating + ", date=" + date + "]";
    }

    class SortByPrice implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getPrice() - o2.getPrice();
        }
    }

    class SortByRating implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return (int) (o1.getRating() - o2.getRating());
        }
    }

    class SortByDate implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    }
}
