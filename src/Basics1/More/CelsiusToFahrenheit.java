package Basics1.More;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());

        // T(°F) = T(°C) × 1.8 + 32
        double fahrenheit = celsius * 1.8 + 32;
        String result = String.format("%.2f", fahrenheit);
        System.out.println(result);
    }
}
