package Comparison;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("The Godfather", "Action", 175, Date.valueOf("1972-03-24")));
        movies.add(new Movie("Krish", "Drama", 202, Date.valueOf("1974-12-20")));
        movies.add(new Movie("The Dark Knight", "Comedy", 152, Date.valueOf("2008-07-18")));
        movies.add(new Movie("Titanic", "Action", 194, Date.valueOf("1997-11-18")));
        movies.add(new Movie("Inception", "Drama", 148, Date.valueOf("2010-07-16")));
        movies.add(new Movie("Interstellar", "Comedy", 169, Date.valueOf("2014-11-07")));
        movies.add(new Movie("The Shawshank", "Action", 142, Date.valueOf("1994-09-23")));

        // Sorting by name
        printHead("Sorted by name");
        printList(movies, new SortByName(), false);

        // Sorting by duration
        printHead("Sorted by duration");
        printList(movies, new SortByDuration(), false);

        // Sorting by Category
        printHead("Sorted by category");
        printList(movies, new SortByCategory(), false);

        // Sorting by date
        printHead("Sorted by date");
        printList(movies, new SortByDate(), false);

        // Sorting by name reverse
        printHead("Sorted by name reverse");
        printList(movies, new SortByName(), true);

        // Sorting by duration reverse
        printHead("Sorted by duration reverse");
        printList(movies, new SortByDuration(), true);

        // Sorting by Category reverse
        printHead("Sorted by category reverse");
        printList(movies, new SortByCategory(), true);

        // Sorting by date reverse
        printHead("Sorted by date reverse");
        printList(movies, new SortByDate(), true);

    }

    public static void printList(List<Movie> movies, Comparator<Movie> c,  Boolean reversed) {

        movies.sort(c);
        if (reversed) {
            Collections.reverse(movies);
        }
        
        // Printing with iterator
        Iterator<Movie> iterator = movies.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printHead(String s) {
        System.out.println("====================================================");
        System.out.printf("%s\n", s);
        System.out.println("====================================================");
    }
}
