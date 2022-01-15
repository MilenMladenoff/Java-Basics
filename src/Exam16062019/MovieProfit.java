package Exam16062019;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int tickets = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        int cinemaCommission = Integer.parseInt(scan.nextLine());
        double profit = (ticketPrice * tickets * days) - (ticketPrice * tickets * days * (cinemaCommission * 1.0 / 100));
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profit);
    }
}
