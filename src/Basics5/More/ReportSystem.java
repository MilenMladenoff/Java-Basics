package Basics5.More;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int totalSold = 0;
        int cashSold = 0;
        int cashCount = 0;
        int cardSold = 0;
        int cardCount = 0;
        int salesCount = 0;
        while (!input.equals("End")){
            int sale = Integer.parseInt(input);
            salesCount++;
            if (salesCount % 2 != 0){
                if (sale > 100){
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cashCount++;
                    cashSold += sale;
                }
            } else {
                if (sale < 10){
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cardCount++;
                    cardSold += sale;
                }
            }
            totalSold = cashSold + cardSold;
            if (totalSold >= target){
                break;
            }
            input = scan.nextLine();
        }
        double averageCash = (cashSold * 1.0) / cashCount;
        double averageCard = (cardSold * 1.0) / cardCount;
        if (totalSold >= target){
            System.out.printf("Average CS: %.2f%nAverage CC: %.2f", averageCash, averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
