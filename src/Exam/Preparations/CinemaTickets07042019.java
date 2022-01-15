package Exam.Preparations;

import java.util.Scanner;

public class CinemaTickets07042019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        while (!movieName.equals("Finish")){
            int capacity = Integer.parseInt(scan.nextLine());
            String seat = scan.nextLine();
            int soldTickets = 0;
            while (!seat.equals("End")){
                soldTickets++;
                switch (seat){
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                if (soldTickets >= capacity){
                    break;
                }
                seat = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, 1.0 * soldTickets / capacity * 100);
            movieName = scan.nextLine();
        }
        int totalTickets = student + standard + kid;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * kid / totalTickets * 100);
    }
}
