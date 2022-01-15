package Basics1.More;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b1 = Double.parseDouble(scan.nextLine());
        double b2 = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double area = (b1 + b2) * h / 2.0;
        String result = String.format("%.2f", area);
        System.out.println(result);
    }
}
