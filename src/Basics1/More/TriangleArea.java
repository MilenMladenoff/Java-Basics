package Basics1.More;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double area = a * h / 2;
        String result = String.format("%.2f", area);
        System.out.println(result);
    }
}
