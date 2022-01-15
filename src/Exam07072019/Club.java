package Exam07072019;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double target = Double.parseDouble(scan.nextLine());
        String cocktailName = scan.nextLine();
        double income = 0;
        while (!cocktailName.equals("Party!")){
            int cocktailPrice = cocktailName.length();
            int currentCocktails = Integer.parseInt(scan.nextLine());
            double purchasePrice = cocktailPrice * currentCocktails;
            if (purchasePrice % 2 != 0){
                purchasePrice = purchasePrice * 0.75;
            }
            income += purchasePrice;
            target -= purchasePrice;
            if (target <= 0){
                break;
            }
            cocktailName = scan.nextLine();
        }
        if (target <= 0){
            System.out.println("Target acquired.");
        } else {
            System.out.printf("We need %.2f leva more.%n", target);
        }
        System.out.printf("Club income - %.2f leva.", income);
    }
}
