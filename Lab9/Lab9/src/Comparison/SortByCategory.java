package Comparison;

import java.util.Comparator;

public class SortByCategory implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}
