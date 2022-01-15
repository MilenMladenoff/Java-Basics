package Exam07072019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double pricePerNight = Double.parseDouble(scan.nextLine());
        int additionalCosts = Integer.parseInt(scan.nextLine());
        if (nights > 7){
            pricePerNight = pricePerNight * 0.95;
        }
        double totalCosts = nights * pricePerNight + budget * (additionalCosts * 1.0 / 100);
        double diff = Math.abs(budget - totalCosts);
        if (budget >= totalCosts){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}
