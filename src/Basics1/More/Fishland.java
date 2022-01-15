package Basics1.More;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mackerelKilo = Double.parseDouble(scan.nextLine());
        double spratKilo = Double.parseDouble(scan.nextLine());
        double bonito = Double.parseDouble(scan.nextLine());
        double scad = Double.parseDouble(scan.nextLine());
        int mussels = Integer.parseInt(scan.nextLine());

        // Паламуд – 60% по-скъп от скумрията
        // Сафрид – 80% по-скъп от цацата
        // Миди – 7.50 лв. за килограм
        double bonitoKilo = mackerelKilo * 1.6;
        double scadKilo = spratKilo * 1.8;
        double sum = bonito * bonitoKilo + scad * scadKilo + mussels * 7.5;
        String total = String.format("%.2f", sum);
        System.out.println(total);
    }
}
