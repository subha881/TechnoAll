import java.util.*;

// Movie class implementing Comparable
class Movie implements Comparable<Movie> {
    private String title;
    private String releaseDate; // in format "yyyy-mm-dd"
    private double rating;

    public Movie(String title, String releaseDate, double rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }

    // Override compareTo to sort by release date
    @Override
    public int compareTo(Movie other) {
        return this.releaseDate.compareTo(other.releaseDate);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating=" + rating +
                '}';
    }
}

// Comparator to sort movies by rating
class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.getRating(), m1.getRating()); // Descending order
    }
}

// Main class
public class MovieSorter {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayListExample<>();
        movies.add(new Movie("Inception", "2010-07-16", 8.8));
        movies.add(new Movie("The Matrix", "1999-03-31", 8.7));
        movies.add(new Movie("Interstellar", "2014-11-07", 8.6));
        movies.add(new Movie("The Dark Knight", "2008-07-18", 9.0));
        movies.add(new Movie("Pulp Fiction", "1994-10-14", 8.9));

        System.out.println("Movies sorted by release date:");
        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nMovies sorted by rating:");
        movies.sort(new RatingComparator());
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
