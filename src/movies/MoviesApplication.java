package movies;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] allMovies = MoviesArray.findAll();

        int response = 1;

        do{
            displayMenu();
            response = sc.nextInt();

            switch (response){
                case 0:
                    break;
                case 1:
                    displayMovies(allMovies);
                    break;
                case 2:
                    displayMovies(allMovies,"animated");
                    break;
                case 3:
                    displayMovies(allMovies, "drama");
                    break;
                case 4:
                    displayMovies(allMovies, "horror");
                    break;
                case 5:
                    displayMovies(allMovies, "scifi");
                    break;
                case 6:
                    displayMovies(allMovies, "musical");
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Enter the movie name: ");
                    String movieName = sc.nextLine();
                    movieName = movieName.trim();
                    System.out.println("Enter the movie category: ");
                    String movieCategory = sc.nextLine();
                    movieCategory = movieCategory.trim();
                    allMovies = addMovie(allMovies, movieName, movieCategory);
                    break;

                default:
                    System.out.println("Not a choice...");
                    break;
            }

        }while(response != 0);
    }

    private static void displayMovies(Movie[] arr){
        System.out.println("\nHere are all the movies in the List\n");
        for(Movie movie: arr){
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }

    private static void displayMovies(Movie[] arr, String category){
        System.out.printf("%nHere are all the movies in %s category: %n%n", category);
        for(Movie movie: arr){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }

    }

    private static Movie[] addMovie(Movie[] arr, String name, String category){
        Movie[] bucket = Arrays.copyOf(arr, arr.length + 1);
        bucket[arr.length] = new Movie(name, category);

        return bucket;
    }

    private static void displayMenu(){
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1- view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - Add a new movie to the list");
        System.out.println("Enter your choice: ");
    }
}
