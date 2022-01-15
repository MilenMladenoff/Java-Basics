package Basics3.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;
        if (city.equals("Sofia") && product.equals("coffee")){
            price = 0.5;
        } else if (city.equals("Sofia") && product.equals("water")){
            price = 0.8;
        } else if (city.equals("Sofia") && product.equals("beer")) {
            price = 1.2;
        } else if (city.equals("Sofia") && product.equals("sweets")) {
            price = 1.45;
        } else if (city.equals("Sofia") && product.equals("peanuts")) {
            price = 1.6;
        } else if (city.equals("Plovdiv") && product.equals("coffee")){
            price = 0.4;
        } else if (city.equals("Plovdiv") && product.equals("water")){
            price = 0.7;
        } else if (city.equals("Plovdiv") && product.equals("beer")) {
            price = 1.15;
        } else if (city.equals("Plovdiv") && product.equals("sweets")) {
            price = 1.3;
        } else if (city.equals("Plovdiv") && product.equals("peanuts")) {
            price = 1.5;
        } else if (city.equals("Varna") && product.equals("coffee")){
            price = 0.45;
        } else if (city.equals("Varna") && product.equals("water")){
            price = 0.7;
        } else if (city.equals("Varna") && product.equals("beer")) {
            price = 1.10;
        } else if (city.equals("Varna") && product.equals("sweets")) {
            price = 1.35;
        } else if (city.equals("Varna") && product.equals("peanuts")) {
            price = 1.55;
        }
        double totalPrice = price * quantity;
        System.out.println(totalPrice);
    }
}
