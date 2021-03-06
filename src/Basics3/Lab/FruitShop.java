package Basics3.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")){
                    price = quantity * 2.5;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("apple")){
                    price = quantity * 1.2;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("orange")){
                    price = quantity * 0.85;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapefruit")){
                    price = quantity * 1.45;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("kiwi")){
                    price = quantity * 2.7;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("pineapple")){
                    price = quantity * 5.5;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapes")){
                    price = quantity * 3.85;
                    System.out.printf("%.2f", price);
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")){
                    price = quantity * 2.7;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("apple")){
                    price = quantity * 1.25;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("orange")){
                    price = quantity * 0.9;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapefruit")){
                    price = quantity * 1.6;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("kiwi")){
                    price = quantity * 3;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("pineapple")){
                    price = quantity * 5.6;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapes")){
                    price = quantity * 4.2;
                    System.out.printf("%.2f", price);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }



    }
}
