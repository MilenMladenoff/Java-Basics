package Exam07042019;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        String ticketType = scan.nextLine();
        int soldTickets = Integer.parseInt(scan.nextLine());
        double income = 0;
        switch (ticketType){
            case "normal":
                if (movieName.equals("A Star Is Born")){
                    income = soldTickets * 7.5;
                } else if (movieName.equals("Bohemian Rhapsody")){
                    income = soldTickets * 7.35;
                } else if (movieName.equals("Green Book")){
                    income = soldTickets * 8.15;
                } else {
                    income = soldTickets * 8.75;
                }
                break;
            case "luxury":
                if (movieName.equals("A Star Is Born")){
                    income = soldTickets * 10.5;
                } else if (movieName.equals("Bohemian Rhapsody")){
                    income = soldTickets * 9.45;
                } else if (movieName.equals("Green Book")){
                    income = soldTickets * 10.25;
                } else {
                    income = soldTickets * 11.55;
                }
                break;
            case "ultra luxury":
                if (movieName.equals("A Star Is Born")){
                    income = soldTickets * 13.5;
                } else if (movieName.equals("Bohemian Rhapsody")){
                    income = soldTickets * 12.75;
                } else if (movieName.equals("Green Book")){
                    income = soldTickets * 13.25;
                } else {
                    income = soldTickets * 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movieName, income);
    }
}
