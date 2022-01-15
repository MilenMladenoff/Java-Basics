package Exam29032020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String pack = scan.nextLine();
        int purchaseQuantity = Integer.parseInt(scan.nextLine());
        double packPrice = 0;
        switch (fruit){
            case "Watermelon":
                if (pack.equals("small")){
                    packPrice = 56 * 2;
                } else {
                    packPrice = 28.7 * 5;
                }
                break;
            case "Mango":
                if (pack.equals("small")){
                    packPrice = 36.66 * 2;
                } else {
                    packPrice = 19.6 * 5;
                }
                break;
            case "Pineapple":
                if (pack.equals("small")){
                    packPrice = 42.1 * 2;
                } else {
                    packPrice = 24.8 * 5;
                }
                break;
            case "Raspberry":
                if (pack.equals("small")){
                    packPrice = 20 * 2;
                } else {
                    packPrice = 15.2 * 5;
                }
                break;
        }
        double totalPrice = packPrice * purchaseQuantity;
        if (totalPrice >= 400 && totalPrice <= 1000){
            totalPrice = totalPrice * 0.85;
        } else if (totalPrice > 1000){
            totalPrice = totalPrice / 2;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
