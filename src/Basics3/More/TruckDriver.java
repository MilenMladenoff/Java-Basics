package Basics3.More;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double kilometersPerMonth = Double.parseDouble(scan.nextLine());

        double price = 0;
        switch (season){
            case "Spring":
            case "Autumn":
                if (kilometersPerMonth <= 5000){
                    price = 0.75;
                } else if (kilometersPerMonth <= 10000){
                    price = 0.95;
                } else {
                    price = 1.45;
                }
                break;
            case "Summer":
                if (kilometersPerMonth <= 5000){
                    price = 0.9;
                } else if (kilometersPerMonth <= 10000){
                    price = 1.1;
                } else {
                    price = 1.45;
                }
                break;
            case "Winter":
                if (kilometersPerMonth <= 5000){
                    price = 1.05;
                } else if (kilometersPerMonth <= 10000){
                    price = 1.25;
                } else {
                    price = 1.45;
                }
        }

        double gross = (kilometersPerMonth * 4) * price;
        double salary = gross * 0.9;
        System.out.printf("%.2f", salary);
    }
}
