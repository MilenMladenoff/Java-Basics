package Basics3.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowerType = scan.nextLine();
        int flowersQuantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double flowerPrice = 0;
        switch (flowerType){
            case "Roses":
                flowerPrice = 5;
                break;
            case "Dahlias":
                flowerPrice = 3.8;
                break;
            case "Tulips":
                flowerPrice = 2.8;
                break;
            case "Narcissus":
                flowerPrice = 3;
                break;
            case "Gladiolus":
                flowerPrice = 2.5;
                break;
        }

        double totalPrice = flowerPrice * flowersQuantity;
        if (flowerType.equals("Roses") && flowersQuantity > 80){
            totalPrice = totalPrice * 0.9;
        } else if (flowerType.equals("Dahlias") && flowersQuantity > 90){
            totalPrice = totalPrice * 0.85;
        } else if (flowerType.equals("Tulips") && flowersQuantity > 80){
            totalPrice = totalPrice * 0.85;
        } else if (flowerType.equals("Narcissus") && flowersQuantity < 120) {
            totalPrice = totalPrice * 1.15;
        } else if (flowerType.equals("Gladiolus") && flowersQuantity < 80) {
            totalPrice = totalPrice * 1.2;
        }

        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersQuantity, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
