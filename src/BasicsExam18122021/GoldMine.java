package BasicsExam18122021;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int locations = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= locations; i++){
            double aimedGoldAverage = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            double takenGoldSum = 0;
            for (int j = 1; j <= days; j++){
                double takenGold = Double.parseDouble(scan.nextLine());
                takenGoldSum += takenGold;
                }
            double takenGoldAverage = takenGoldSum / days;
            double diff = Math.abs(aimedGoldAverage - takenGoldAverage);
            if (aimedGoldAverage <= takenGoldAverage){
                System.out.printf("Good job! Average gold per day: %.2f.%n", takenGoldAverage);
            } else {
                System.out.printf("You need %.2f gold.%n", diff);
            }
        }
    }
}
