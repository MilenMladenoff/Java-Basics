package Exam21042019;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int easterBreadQuantity = Integer.parseInt(scan.nextLine());
        int maxSugar = 0;
        int maxFlour = 0;
        int sugarCounter = 0;
        int flourCounter = 0;
        for (int i = 1; i <= easterBreadQuantity; i++){
            int currentSugar = Integer.parseInt(scan.nextLine());
            int currentFlour = Integer.parseInt(scan.nextLine());
            sugarCounter += currentSugar;
            flourCounter += currentFlour;
            if (maxSugar < currentSugar){
                maxSugar = currentSugar;
            }
            if (maxFlour < currentFlour){
                maxFlour = currentFlour;
            }
        }
        System.out.printf("Sugar: %.0f%n", Math.ceil(sugarCounter * 1.0 / 950));
        System.out.printf("Flour: %.0f%n", Math.ceil(flourCounter * 1.0 / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
