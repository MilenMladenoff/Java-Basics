package Basics1.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int subscription = Integer.parseInt(scan.nextLine());

        double sneakers = subscription * 0.6;
        double suit = sneakers * 0.8;
        double ball = suit / 4;
        double accessories = ball / 5;

        double total = subscription + sneakers + suit + ball + accessories;

        System.out.printf("%.2f", total);
    }
}
