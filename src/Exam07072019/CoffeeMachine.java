package Exam07072019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String drinksType = scan.nextLine();
        String sugar = scan.nextLine();
        int drinksQuantity = Integer.parseInt(scan.nextLine());
        double singlePrice = 0;
        switch (drinksType){
            case "Espresso":
                switch (sugar){
                    case "Without":
                        singlePrice = 0.9;
                        break;
                    case "Normal":
                        singlePrice = 1;
                        break;
                    case "Extra":
                        singlePrice = 1.2;
                        break;
                }
                break;
            case "Cappuccino":
                switch (sugar){
                    case "Without":
                        singlePrice = 1;
                        break;
                    case "Normal":
                        singlePrice = 1.2;
                        break;
                    case "Extra":
                        singlePrice = 1.6;
                        break;
                }
                break;
            case "Tea":
                switch (sugar){
                    case "Without":
                        singlePrice = 0.5;
                        break;
                    case "Normal":
                        singlePrice = 0.6;
                        break;
                    case "Extra":
                        singlePrice = 0.7;
                        break;
                }
                break;
        }
        if (sugar.equals("Without")){
            singlePrice = singlePrice * 0.65;
        }
        double totalSum = singlePrice * drinksQuantity;
        if (drinksType.equals("Espresso") && drinksQuantity >= 5){
            totalSum = totalSum * 0.75;
        }
        if (totalSum > 15){
            totalSum = totalSum * 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", drinksQuantity, drinksType, totalSum);
    }
}
