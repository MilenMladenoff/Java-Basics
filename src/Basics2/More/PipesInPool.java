package Basics2.More;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double p1Fill = p1 * h;
        double p2Fill = p2 * h;
        double filled = p1Fill + p2Fill;
        double diff = Math.abs(v - filled);

        double p1Percent = (p1Fill / filled) * 100;
        double p2Percent = (p2Fill / filled) * 100;
        double filledPercent = (filled / v) * 100;
        if (v >= filled){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", filledPercent, p1Percent, p2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, diff);
        }
    }
}
