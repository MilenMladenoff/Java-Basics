package Exam16062019;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie = scan.nextLine();
        int movieCounter = 0;
        int maxPoints = 0;
        String favoriteMovie = "";
        while (!movie.equals("STOP")){
            movieCounter++;
            if (movieCounter == 7){
                System.out.println("The limit is reached.");
                break;
            }
            int currentPoints = 0;
            int lowercaseCounter = 0;
            int uppercaseCounter = 0;
            for (int i = 0; i < movie.length(); i++){
                char letter = movie.charAt(i);
                currentPoints += letter;
                if (Character.isUpperCase(letter)){
                    uppercaseCounter++;
                } else if (Character.isLowerCase(letter)){
                    lowercaseCounter++;
                }
            }
            currentPoints = (currentPoints - lowercaseCounter * (movie.length() * 2)) - uppercaseCounter * movie.length();
            if (currentPoints >= maxPoints){
                maxPoints = currentPoints;
                favoriteMovie = movie;
            }
            movie = scan.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", favoriteMovie, maxPoints);
    }
}
