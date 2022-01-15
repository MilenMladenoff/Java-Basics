package Basics2.More;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int area = Integer.parseInt(scan.nextLine());
        double grapesPerMeter = Double.parseDouble(scan.nextLine());
        int target = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double sumGrapes = area * grapesPerMeter;
        double madeWine = (sumGrapes * 0.4) / 2.5;
        double diff = Math.abs(target - madeWine);

        if (target > madeWine){
            diff = Math.floor(diff);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);
        } else {
            madeWine = Math.floor(madeWine);
            diff = Math.ceil(diff);
            double ration = Math.ceil(diff / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n%.0f liters left -> %.0f liters per person.", madeWine, diff, ration);
        }
    }
}
