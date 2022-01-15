package basics4.Exercises;

import java.util.Scanner;

public class TennisRankings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tours = Integer.parseInt(scan.nextLine());
        int initialPoints = Integer.parseInt(scan.nextLine());
        double wins = 0;
        int pointsEarned = initialPoints;
        for (int i = 1; i <= tours; i++){
            String record = scan.nextLine();
            switch (record){
                case "W":
                    pointsEarned += 2000;
                    wins += 1;
                    break;
                case "F":
                    pointsEarned += 1200;
                    break;
                case "SF":
                    pointsEarned += 720;
                    break;
            }
        }
        double winsPercentage = (wins / tours) * 100;
        System.out.printf("Final points: %d%n", pointsEarned);
        System.out.printf("Average points: %.0f%n", (pointsEarned - initialPoints) / tours * 1.0);
        System.out.printf("%.2f%%", winsPercentage);
    }
}
