package Basics1.More;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());

        double circleArea = Math.PI * r * r;
        double circlePerimeter = 2 * Math.PI * r;
        String area = String.format("%.2f", circleArea);
        String perimeter = String.format("%.2f", circlePerimeter);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
