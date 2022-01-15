package Exam.Preparations;

import java.util.Scanner;

public class EasterDecoration21042019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int clients = Integer.parseInt(scan.nextLine());
        double totalIncome = 0;
        for (int i = 1; i <= clients; i++){
            String item = scan.nextLine();
            double purchase = 0;
            double itemPrice = 0;
            int itemsCount = 0;
            while (!item.equals("Finish")){
                switch (item){
                    case "basket":
                        itemPrice = 1.5;
                        break;
                    case "wreath":
                        itemPrice = 3.8;
                        break;
                    case "chocolate bunny":
                        itemPrice = 7;
                        break;
                }
                purchase += itemPrice;
                itemsCount++;
                item = scan.nextLine();
            }
            if (itemsCount % 2 == 0){
                purchase = purchase * 0.8;
            }
            totalIncome += purchase;
            System.out.printf("You purchased %d items for %.2f leva.%n", itemsCount, purchase);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalIncome / clients);
    }
}
