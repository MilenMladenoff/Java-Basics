package Exam29032020;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        char sex = scan.nextLine().charAt(0);
        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();
        double cardPrice = 0;
        switch (sport){
            case "Gym":
                if (sex == 'm'){
                    cardPrice = 42;
                } else {
                    cardPrice = 35;
                }
                break;
            case "Boxing":
                if (sex == 'm'){
                    cardPrice = 41;
                } else {
                    cardPrice = 37;
                }
                break;
            case "Yoga":
                if (sex == 'm'){
                    cardPrice = 45;
                } else {
                    cardPrice = 42;
                }
                break;
            case "Zumba":
                if (sex == 'm'){
                    cardPrice = 34;
                } else {
                    cardPrice = 31;
                }
                break;
            case "Dances":
                if (sex == 'm'){
                    cardPrice = 51;
                } else {
                    cardPrice = 53;
                }
                break;
            case "Pilates":
                if (sex == 'm'){
                    cardPrice = 39;
                } else {
                    cardPrice = 37;
                }
                break;
        }
        if (age <= 19){
            cardPrice = cardPrice * 0.8;
        }
        double diff = Math.abs(budget - cardPrice);
        if (budget >= cardPrice){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", diff);
        }
    }
}
