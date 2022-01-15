package Exam07072019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        double entryFee = Double.parseDouble(scan.nextLine());
        double sunbedPrice = Double.parseDouble(scan.nextLine());
        double umbrellaPrice = Double.parseDouble(scan.nextLine());
        double sunbedsQuantity = Math.ceil(people * 0.75);
        double umbrellasQuantity = Math.ceil((people * 1.0) / 2);
        double totalCost = sunbedPrice * sunbedsQuantity + umbrellasQuantity * umbrellaPrice + entryFee * people;
        System.out.printf("%.2f lv.", totalCost);
    }
}
