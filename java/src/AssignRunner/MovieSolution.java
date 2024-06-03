package AssignRunner;
import assignment.Movie;
import java.util.Scanner;

public class MovieSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for four Movie objects and parameters
        Movie[] movies = new Movie[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Movie " + (i + 1) + ":");
            System.out.print("Movie Id: ");
            int movieId = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Director: ");
            String director = scanner.nextLine().trim();
            System.out.print("Rating: ");
            int rating = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Budget (in crores): ");
            int budget = Integer.parseInt(scanner.nextLine().trim());
            movies[i] = new Movie(movieId, director, rating, budget);
        }

        System.out.print("Enter the director to find average budget: ");
        String director = scanner.nextLine().trim();

        // Call findAvgBudgetByDirector method and print the result
        double avgBudget = findAvgBudgetByDirector(movies, director);
        if (avgBudget > 0) {
            System.out.println("Average Budget: " + avgBudget + " crores");
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        System.out.print("Enter the rating: ");
        int rating = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter the budget (in crores): ");
        int budget = Integer.parseInt(scanner.nextLine().trim());

        // Call getMovieByRatingBudget method and print the result
        Movie movie = getMovieByRatingBudget(movies, rating, budget);
        if (movie != null) {
            System.out.println("Movie Id: " + movie.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }

        scanner.close();
    }

    public static double findAvgBudgetByDirector(Movie[] movies, String director) {
        int sum = 0;
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                sum += movie.getBudget();
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }

    public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget) {
        for (Movie movie : movies) {
            if (movie.getRating() == rating && movie.getBudget() % rating == 0 && movie.getBudget() >= budget) {
                return movie;
            }
        }
        return null;
    }
}