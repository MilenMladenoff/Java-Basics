package Exam19072020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double over20Price = Double.parseDouble(scan.nextLine());
        double kilos = Double.parseDouble(scan.nextLine());
        int remainingDays = Integer.parseInt(scan.nextLine());
        int bagsQuantity = Integer.parseInt(scan.nextLine());
        double luggagePrice = 0;
        if (kilos < 10){
            luggagePrice = over20Price * 0.2;
        } else if (kilos <= 20){
            luggagePrice = over20Price / 2;
        } else {
            luggagePrice = over20Price;
        }
        if (remainingDays < 7){
            luggagePrice = luggagePrice * 1.4;
        } else if (remainingDays <= 30){
            luggagePrice = luggagePrice * 1.15;
        } else {
            luggagePrice = luggagePrice * 1.1;
        }
        double totalLuggagePrice = luggagePrice * bagsQuantity;
        System.out.printf("The total price of bags is: %.2f lv. ", totalLuggagePrice);
    }
}
