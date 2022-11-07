package Comparison;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000, 4.5, LocalDate.of(2019, 1, 5)));
        products.add(new Product("Mobile", 500, 4.0, LocalDate.of(2018, 3, 9)));
        products.add(new Product("Tablet", 700, 3.5, LocalDate.of(2022, 1, 1)));
        products.add(new Product("TV", 2000, 4.0, LocalDate.of(2022, 10, 21)));
        products.add(new Product("Watch", 100, 3.5, LocalDate.of(2022, 8, 19)));
        
        // Without sorting
        System.out.println("Without sorting");
        printProducts(products);

        // With default sorting
        products.sort(null);
        System.out.println("After Default Sorting");
        printProducts(products);

        // After sorting by price
        products.sort(new Product().new SortByPrice());
        System.out.println("After sorting by price");
        printProducts(products);

        // After sorting by rating
        products.sort(new Product().new SortByRating());
        System.out.println("After sorting by rating");
        printProducts(products);

        // After sorting by date
        products.sort(new Product().new SortByDate());
        System.out.println("After sorting by date");
        printProducts(products);

        // Reverse sorting by price
        products.sort(new Product().new SortByPrice().reversed());
        System.out.println("Reverse sorting by price");
        printProducts(products);

        // Sorting by lambda expression
        // products.sort((p1, p2) -> p1.getDate().compareTo(p2.getDate()));
        // printProducts(products);    
    }

    public static void printProducts(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
