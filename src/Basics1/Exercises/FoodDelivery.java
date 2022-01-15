package Basics1.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int veggie = Integer.parseInt(scan.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double veggiePrice = veggie * 8.15;

        double total = (chickenPrice + fishPrice + veggiePrice) * 1.2 + 2.5;

        System.out.println(total);
    }
}
