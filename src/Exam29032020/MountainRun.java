package Exam29032020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double secondsPerMeter = Double.parseDouble(scan.nextLine());
        double secondsForDistance = distance * secondsPerMeter;
        double delay = Math.floor(distance / 50) * 30;
        double totalTime = secondsForDistance + delay;
        double diff = Math.abs(record - totalTime);
        if (totalTime < record){
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}
