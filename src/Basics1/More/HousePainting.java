package Basics1.More;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double greenArea = ((x * x) * 2 - 1.2 * 2) + ((x * y) * 2 - (1.5 * 1.5) * 2);
        double redArea = (x * y) * 2 + ((x * h) / 2) * 2;
        double greenL = greenArea / 3.4;
        double redL = redArea / 4.3;
        String greenPaint = String.format("%.2f", greenL);
        String redPaint = String.format("%.2f", redL);
        System.out.println(greenPaint);
        System.out.println(redPaint);
    }
}
