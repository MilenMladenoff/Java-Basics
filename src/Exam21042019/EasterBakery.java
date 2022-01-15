package Exam21042019;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double singleFlourPrice = Double.parseDouble(scan.nextLine());
        double flourQuantity = Double.parseDouble(scan.nextLine());;
        double sugarQuantity = Double.parseDouble(scan.nextLine());;
        int eggsQuantity = Integer.parseInt(scan.nextLine());
        int yeastQuantity = Integer.parseInt(scan.nextLine());
        double sugarSinglePrice = singleFlourPrice * 0.75;
        double eggsPrice = singleFlourPrice * 1.1;
        double yeastSinglePrice = sugarSinglePrice * 0.2;
        double totalSum = singleFlourPrice * flourQuantity + sugarSinglePrice * sugarQuantity + eggsPrice * eggsQuantity + yeastSinglePrice * yeastQuantity;
        System.out.printf("%.2f", totalSum);
    }
}
