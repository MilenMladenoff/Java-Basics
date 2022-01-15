package Exam16062019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seriesName = scan.nextLine();
        int seasons = Integer.parseInt(scan.nextLine());
        int episodes = Integer.parseInt(scan.nextLine());
        double runningTime = Double.parseDouble(scan.nextLine());
        double totalTime = Math.floor((runningTime * 1.2) * (seasons * episodes) + (seasons * 10));
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, totalTime);
    }
}
