package Exam03052019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String product = scan.nextLine();
        int productCounter = 0;
        double purchaseSum = 0;
        while (!product.equals("Stop")){
            double productPrice = Double.parseDouble(scan.nextLine());
            productCounter++;
            if (productCounter % 3 == 0) {
                productPrice = productPrice / 2;
            }
            if (budget >= productPrice){
                purchaseSum += productPrice;
                budget -= productPrice;
            } else {
                productCounter = productCounter - 1;
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", productPrice - budget);
                break;
            }
            product = scan.nextLine();
        }
        if (product.equals("Stop")){
            System.out.printf("You bought %d products for %.2f leva.", productCounter, purchaseSum);
        }
    }
}
