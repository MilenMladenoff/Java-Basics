package Basics3.More;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int people = Integer.parseInt(scan.nextLine());

        double singleTicketPrice = 0;
        if (category.equals("VIP")){
            singleTicketPrice = 499.99;
        } else {
            singleTicketPrice = 249.99;
        }
        double allTicketsPrice = singleTicketPrice * people;

        double transport = 0;
        if (people < 5) {
            transport = budget * 0.75;
        } else if (people < 10) {
            transport = budget * 0.6;
        } else if (people < 25) {
            transport = budget * 0.5;
        } else if (people < 50) {
            transport = budget * 0.4;
        } else {
            transport = budget * 0.25;
        }

        double costs = transport + allTicketsPrice;
        double diff = Math.abs(budget - costs);
        if (budget >= costs) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
