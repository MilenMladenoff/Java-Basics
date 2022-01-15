package basics4.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washingMachinePrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int toys = 0;
        double giftMoney = 0;
        double allGiftMoney = 0;
        int brotherCount = 0;
        for (int i = 1; i <= age; i++){
            if (i % 2 == 0){
                giftMoney += 10;
                allGiftMoney += giftMoney;
                brotherCount++;
            } else {
                toys++;
            }
        }
        double profit = allGiftMoney + (toyPrice * toys) - brotherCount;
        double diff = Math.abs(profit - washingMachinePrice);
        if (profit >= washingMachinePrice){
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
