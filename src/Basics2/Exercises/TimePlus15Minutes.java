package Basics2.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int sumMinutes = (hour * 60) + minutes + 15;
        int newHour = sumMinutes / 60;
        int newMinutes = sumMinutes % 60;

        if (newHour > 23){
            newHour = 0;
        }
        if (newMinutes < 10){
            System.out.printf("%d:0%d", newHour, newMinutes);
        } else {
            System.out.printf("%d:%d", newHour, newMinutes);
        }
    }
}
