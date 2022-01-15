package Exam07042019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int moviesQuantity = Integer.parseInt(scan.nextLine());
        double highestRating = 0;
        double lowestRating = 11;
        double ratingsSum = 0;
        String bestMovie = "";
        String worstMovie = "";
        for (int i = 1; i <= moviesQuantity; i++){
            String movieName = scan.nextLine();
            double movieRating = Double.parseDouble(scan.nextLine());
            ratingsSum += movieRating;
            if (movieRating > highestRating){
                highestRating = movieRating;
                bestMovie = movieName;
            }
            if (movieRating < lowestRating){
                lowestRating = movieRating;
                worstMovie = movieName;
            }
        }
        double averageRating = ratingsSum / moviesQuantity;
        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", worstMovie, lowestRating);
        System.out.printf("Average rating: %.1f%n", averageRating);
    }
}
