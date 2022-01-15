package Exam16062019;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        String snackType = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        double ticketPrice = 0;
        switch (movieName){
            case "John Wick":
                if (snackType.equals("Drink")){
                    ticketPrice = 12;
                } else if (snackType.equals("Popcorn")){
                    ticketPrice = 15;
                } else {
                    ticketPrice = 19;
                }
                break;
            case "Star Wars":
                if (snackType.equals("Drink")){
                    ticketPrice = 18;
                } else if (snackType.equals("Popcorn")){
                    ticketPrice = 25;
                } else {
                    ticketPrice = 30;
                }
                break;
            case "Jumanji":
                if (snackType.equals("Drink")){
                    ticketPrice = 9;
                } else if (snackType.equals("Popcorn")){
                    ticketPrice = 11;
                } else {
                    ticketPrice = 14;
                }
                break;
        }
        double purchasePrice = ticketPrice * tickets;
        if (movieName.equals("Star Wars") && tickets >= 4){
            purchasePrice = purchasePrice * 0.7;
        }
        if (movieName.equals("Jumanji") && tickets == 2){
            purchasePrice = purchasePrice * 0.85;
        }
        System.out.printf("Your bill is %.2f leva.", purchasePrice);
    }
}
