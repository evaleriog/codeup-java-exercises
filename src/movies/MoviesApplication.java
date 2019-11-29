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
                    System.out.println("Enter the movie name: ");
                    String movieName = sc.next();
                    movieName.trim();
                    System.out.println("Enter the movie category: ");
                    String movieCategory = sc.next();
                    movieCategory.trim();
                    allMovies = addMovie(allMovies, movieName, movieCategory);
                    break;
                default:
                    System.out.println("Not a choice...");
                    break;
            }

        }while(response != 0);
    }
    public static void displayMovies(Movie[] arr){
        for(Movie movie: arr){
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }
    public static void displayMovies(Movie[] arr, String category){

        for(Movie movie: arr){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }

    }

    public static Movie[] addMovie(Movie[] arr, String name, String category){
        Movie[] bucket = new Movie[arr.length + 1];

        for(int x=0; x < arr.length; x++){
            bucket[x] = arr[x];
        }

        bucket[arr.length] = new Movie(name, category);

        return bucket;
    }

    public static void displayMenu(){
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1- view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - Add a new movie to the list");
        System.out.println("Enter your choice: ");
    }
}
