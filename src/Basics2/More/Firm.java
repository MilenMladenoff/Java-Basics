package Basics2.More;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int targetHours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        int overtime = workers * (2 * days);
        double workingHours = Math.floor((days * 0.9) * 8 + overtime);
        double diff = Math.abs(targetHours - workingHours);

        if (targetHours <= workingHours){
            System.out.printf("Yes!%.0f hours left.", diff);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", diff);
        }

    }
}
