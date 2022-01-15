package Exam21042019;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        double priceForOneGuest = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        if (guests >= 10 && guests <= 15){
            priceForOneGuest = priceForOneGuest * 0.85;
        } else if (guests > 15 && guests <= 20){
            priceForOneGuest = priceForOneGuest * 0.8;
        } else if (guests > 20){
            priceForOneGuest = priceForOneGuest * 0.75;
        }
        double totalCost = guests * priceForOneGuest + budget * 0.1;
        double diff = Math.abs(budget - totalCost);
        if (budget >= totalCost){
            System.out.printf("It is party time! %.2f leva left.", diff);
        } else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}
