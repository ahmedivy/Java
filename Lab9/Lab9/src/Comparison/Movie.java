package Comparison;

import java.util.Comparator;
import java.sql.Date;

public class Movie implements Comparable<Movie>, Comparator<Movie> {
    private String title;
    private String category;
    private int duration;
    private Date releaseDate;

    public Movie(String title, String category, int duration, Date releaseDate) {
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        // return String.format("%s (%s) - %d min - %s", title, category, duration, releaseDate);
        return String.format("%-15s %-10s %6d       %10s", title, category, duration, releaseDate);
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.title.compareTo(o2.title);
    }
}
