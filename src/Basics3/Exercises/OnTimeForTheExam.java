package Basics3.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMinutes = Integer.parseInt(scan.nextLine());

        int exam = examHour * 60 + examMinutes;
        int arrival = arrivalHour * 60 + arrivalMinutes;
        int diff = Math.abs(exam - arrival);
        int diffHour = diff / 60;
        int diffMinutes = diff % 60;
        if (arrival > exam){
            System.out.println("Late");
            if (diff >= 60){
                System.out.printf("%d:%02d hours after the start", diffHour, diffMinutes);
            } else {
                System.out.printf("%d minutes after the start", diffMinutes);
            }
        } else if (exam == arrival){
            System.out.println("On time");
        } else if (diff <= 30){
            System.out.println("On time");
            System.out.printf("%d minutes before the start", diffMinutes);
        } else {
            System.out.println("Early");
            if (diff >= 60){
                System.out.printf("%d:%02d hours before the start", diffHour, diffMinutes);
            } else {
                System.out.printf("%d minutes before the start", diffMinutes);
            }
        }
    }
}
