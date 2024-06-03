package AssignRunner;
import assignment.Movies;
import java.util.Scanner;
public class MoviesSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for four Movie objects and searchGenre
        Movies[] movies = new Movies[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Movie " + (i + 1) + ":");
            System.out.print("Movie Name: ");
            String movieName = scanner.nextLine().trim();
            System.out.print("Company: ");
            String company = scanner.nextLine().trim();
            System.out.print("Genre: ");
            String genre = scanner.nextLine().trim();
            System.out.print("Budget: ");
            int budget = Integer.parseInt(scanner.nextLine().trim());
            movies[i] = new Movies(movieName, company, genre, budget);
        }

        System.out.print("Enter the search genre: ");
        String searchGenre = scanner.nextLine().trim();

        // Call getMovieByGenre method and print the result
        Movies[] resultMovies = getMovieByGenre(movies, searchGenre);
        for (Movies movie : resultMovies) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }

        scanner.close();
    }

    public static Movies[] getMovieByGenre(Movies[] movies, String searchGenre) {
        int count = 0;
        for (Movies movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                count++;
            }
        }
        Movies[] resultMovies = new Movies[count];
        int index = 0;
        for (Movies movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                resultMovies[index++] = movie;
            }
        }
        return resultMovies;
    }
}