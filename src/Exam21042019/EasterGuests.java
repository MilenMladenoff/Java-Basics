package Exam21042019;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double easterBreadNeeded = Math.ceil(guests * 1.0 / 3);
        int eggsNeeded = guests * 2;
        double totalCost = easterBreadNeeded * 4 + eggsNeeded * 0.45;
        double diff = Math.abs(budget - totalCost);
        if (budget >= totalCost){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", easterBreadNeeded, eggsNeeded);
            System.out.printf("He has %.2f lv. left.", diff);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", diff);
        }
    }
}
