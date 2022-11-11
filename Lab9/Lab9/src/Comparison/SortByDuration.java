package Comparison;

import java.util.Comparator;

public class SortByDuration implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getDuration() - o2.getDuration();
    }
}
