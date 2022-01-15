package Basics1.Exercises;

import java.util.Scanner;

public class P01USDToBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        double bgn = input * 1.79549;
        System.out.println(bgn);
    }
}
