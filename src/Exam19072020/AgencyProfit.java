package Exam19072020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String company = scan.nextLine();
        int adults = Integer.parseInt(scan.nextLine());
        int children = Integer.parseInt(scan.nextLine());
        double adultsPrice = Double.parseDouble(scan.nextLine());
        double service = Double.parseDouble(scan.nextLine());
        double childrenPrice = adultsPrice * 0.3;
        double adultPricePlusService = adultsPrice + service;
        double childrenPricePlusService = childrenPrice + service;
        double totalPrice = adultPricePlusService * adults + childrenPricePlusService * children;
        double profit = totalPrice * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, profit);
    }
}
