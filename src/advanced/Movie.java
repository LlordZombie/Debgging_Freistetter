package advanced;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public record Movie(String name, int release) {

    public static void main(String[] args) {
        Movie[] movies = new Movie[8];
        String message, entry;
        movies[0] = new Movie("The Godfather", 1972);
        movies[1] = new Movie("The Good, the Bad, and the Ugly", 1966);
        movies[2] = new Movie("Pulp Fiction", 1994);
        movies[3] = new Movie("Shindler's List", 1993);
        movies[4] = new Movie("Casablanca", 1942);
        movies[5] = new Movie("Wizard of Oz", 1939);
        movies[6] = new Movie("Citizen Kane", 1941);
        movies[7] = new Movie("Some Like It Hot", 1959);
        entry = JOptionPane.showInputDialog(null, "Sort Movies by\n(N)ame, or (Y)ear");

        if (entry.equalsIgnoreCase("N")) {
            movies = Arrays.stream(movies).sorted(Comparator.comparing(Movie::name)).distinct().toArray(Movie[]::new);
            message = "Sorted by Name\n";
        } else if (entry.equalsIgnoreCase("Y")) {
            movies = Arrays.stream(movies).sorted(Comparator.comparing(Movie::release)).distinct().toArray(Movie[]::new);
            message = "Sorted by Year\n";
        } else {
            throw new IllegalArgumentException("Invalid input: " + entry);
        }
        display(movies, message);
    }


    public static void display(Movie[] movies, String msg) {
        StringBuilder msgBuilder = new StringBuilder(msg);
        for (Movie movie : movies)
            msgBuilder.append(movie.name()).append(", ").append(movie.release()).append("\n");
        msg = msgBuilder.toString();
        JOptionPane.showMessageDialog(null, msg);
    }
}

