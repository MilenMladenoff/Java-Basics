package Basics1.More;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scan.nextLine());
        double fruitsPrice = Double.parseDouble(scan.nextLine());
        int vegetablesQuantity = Integer.parseInt(scan.nextLine());
        int fruitsQuantity = Integer.parseInt(scan.nextLine());

        double total = (vegetablesPrice * vegetablesQuantity + fruitsPrice * fruitsQuantity) / 1.94;
        String result = String.format("%.2f", total);
        System.out.println(result);
    }
}
