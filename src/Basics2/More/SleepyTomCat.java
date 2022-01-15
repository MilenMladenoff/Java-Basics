package Basics2.More;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysOff = Integer.parseInt(scan.nextLine());

        int playMinutes = (daysOff * 127) + (365 - daysOff) * 63;
        int diff = Math.abs(30000 - playMinutes);
        int diffHours = diff / 60;
        int diffMinutes = diff % 60;
        if (playMinutes > 30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", diffHours, diffMinutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", diffHours, diffMinutes);
        }

    }
}
