package Exam03052019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double petrolNeeded = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();
        double totalCost = petrolNeeded * 2.1 + 100;
        if (day.equals("Saturday")){
            totalCost = totalCost * 0.9;
        } else {
            totalCost = totalCost * 0.8;
        }
        double diff = Math.abs(budget - totalCost);
        if (budget >= totalCost){
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }
    }
}
