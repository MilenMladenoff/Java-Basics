package Basics1.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cover = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double coverPrice = (cover + 2) * 1.5;
        double paintPrice = (paint * 1.1) * 14.5;
        double thinnerPrice = thinner * 5.0;
        double materialsSum = coverPrice + paintPrice + thinnerPrice + 0.40;
        double workersCost = (materialsSum * 0.3) * hours;

        double total = materialsSum + workersCost;

        System.out.println(total);
    }
}
