package Exam29032020;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int availableKilosFood = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int eatenFood = 0;
        while (!input.equals("Adopted")){
            int currentGramsFood = Integer.parseInt(input);
            eatenFood += currentGramsFood;
            input = scan.nextLine();
        }
        int availableGramsFood = availableKilosFood * 1000;
        int diff = Math.abs(availableGramsFood - eatenFood);
        if (availableGramsFood >= eatenFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
