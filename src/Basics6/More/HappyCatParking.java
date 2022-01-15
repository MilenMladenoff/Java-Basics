package Basics6.More;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int hoursPerDay = Integer.parseInt(scan.nextLine());
        double taxesTotal = 0;
        for (int i = 1; i <= days; i++){
            double dailyTax = 0;
            for (int j = 1; j <= hoursPerDay; j++){
                if ((i % 2 == 0) && (j % 2 != 0)){
                    dailyTax += 2.5;
                } else if ((i % 2 != 0) && (j % 2 == 0)){
                    dailyTax += 1.25;
                } else {
                    dailyTax += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, dailyTax);
            taxesTotal += dailyTax;
        }
        System.out.printf("Total: %.2f leva%n", taxesTotal);
    }
}
