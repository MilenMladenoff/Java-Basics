package Basics2.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double outfitPrice = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.1;
        double totalOutfitPrice = people * outfitPrice;
        if (people > 150){
            totalOutfitPrice = totalOutfitPrice * 0.9;
        }
        double expenses = decor + totalOutfitPrice;
        double diff = Math.abs(budget - expenses);
        if (budget >= expenses){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
