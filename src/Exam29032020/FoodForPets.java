package Exam29032020;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double availableFood = Integer.parseInt(scan.nextLine());
        double dogEatenFood = 0;
        double catEatenFood = 0;
        double totalEatenBiscuits = 0;
        for (int i = 1; i <= days; i++){
            int dailyDogFood = Integer.parseInt(scan.nextLine());
            int dailyCatFood = Integer.parseInt(scan.nextLine());
            dogEatenFood += dailyDogFood;
            catEatenFood += dailyCatFood;
            if (i % 3 == 0){
                double currentEatenBiscuits = (dailyCatFood + dailyDogFood) * 0.1;
                totalEatenBiscuits += currentEatenBiscuits;
            }
        }
        double totalEatenFood = catEatenFood + dogEatenFood;
        double eatenFoodPercentage = totalEatenFood / availableFood * 100;
        double dogEatenPercentage =  dogEatenFood / totalEatenFood * 100;
        double catEatenPercentage =  catEatenFood / totalEatenFood * 100;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalEatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", eatenFoodPercentage);
        System.out.printf("%.2f%% eaten from the dog.%n", dogEatenPercentage);
        System.out.printf("%.2f%% eaten from the cat.%n", catEatenPercentage);
    }
}
