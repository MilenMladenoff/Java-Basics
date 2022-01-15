package Exam29032020;

import java.util.Scanner;

public class CatWalking {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesPerWalk = Integer.parseInt(scan.nextLine());
        int walks = Integer.parseInt(scan.nextLine());
        int takenCalories = Integer.parseInt(scan.nextLine());
        int walkMinutesSum = minutesPerWalk * walks;
        int burnedCalories = walkMinutesSum * 5;
        if (burnedCalories >= takenCalories / 2){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.%n", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.%n", burnedCalories);
        }
    }
}
