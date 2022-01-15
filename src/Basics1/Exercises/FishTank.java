package Basics1.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double accessories = Double.parseDouble(scan.nextLine());

        double volume = (length * width * height) / 1000.0;
        double total = volume - volume * (accessories / 100);
        System.out.println(total);

    }
}
