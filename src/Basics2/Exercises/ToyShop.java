package Basics2.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int teddies = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double profit = ((puzzles * 2.6) + (dolls * 3) + (teddies * 4.1) + (minions * 8.2) + (trucks * 2)) * 0.9;
        int toysCount = puzzles + dolls + teddies + minions + trucks;

        if (toysCount >= 50){
            profit = profit * 0.75;
        }
        double difference = Math.abs(profit - tripPrice);

        if (profit >= tripPrice){
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }

    }
}
