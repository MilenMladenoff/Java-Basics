package Basics2.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int videoCount = Integer.parseInt(scan.nextLine());
        int processorsCount = Integer.parseInt(scan.nextLine());
        int ramCount = Integer.parseInt(scan.nextLine());

        double videoPrice = videoCount * 250.0;
        double processorsPrice = processorsCount * (videoPrice * 0.35);
        double ramPrice = ramCount * (videoPrice * 0.1);
        double totalPrice = videoPrice + processorsPrice + ramPrice;
        if (videoCount > processorsCount){
            totalPrice = totalPrice * 0.85;
        }
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
