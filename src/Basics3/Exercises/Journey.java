package Basics3.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        double price = 0;
        if (budget <= 100){
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")) {
                price = budget * 0.3;
                System.out.printf("Camp - %.2f", price);
            } else {
                price = budget * 0.7;
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget <= 1000){
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")){
                price = budget * 0.4;
                System.out.printf("Camp - %.2f", price);
            } else {
                price = budget * 0.8;
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget > 1000){
            System.out.println("Somewhere in Europe");
            price = budget * 0.9;
            System.out.printf("Hotel - %.2f", price);
        }

    }
}
