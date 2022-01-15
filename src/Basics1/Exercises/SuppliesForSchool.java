package Basics1.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int liters = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double litersPrice = liters * 1.20;


        double total = (pensPrice + markersPrice + litersPrice) - (pensPrice + markersPrice + litersPrice) * ((discount * 1.0) / 100);

        System.out.println(total);
    }
}
