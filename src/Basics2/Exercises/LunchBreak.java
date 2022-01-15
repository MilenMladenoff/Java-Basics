package Basics2.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seriesName = scan.nextLine();
        int episodeRunningTime = Integer.parseInt(scan.nextLine());
        int breakTime = Integer.parseInt(scan.nextLine());

        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;
        double leftTime = breakTime - (lunchTime + restTime);

        double diff = Math.abs(leftTime - episodeRunningTime);
        if (leftTime >= episodeRunningTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(diff));
        }
    }
}
