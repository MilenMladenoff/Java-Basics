package Exam10032019;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int controlMinutes = Integer.parseInt(scan.nextLine());
        int controlSeconds = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        int secondsFor100 = Integer.parseInt(scan.nextLine());
        int controlTime = controlMinutes * 60 + controlSeconds;
        double acceleration = (length / 120) * 2.5;
        double playerTime = (length / 100) * secondsFor100 - acceleration;
        if (playerTime <= controlTime){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", playerTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", playerTime - controlTime);
        }
    }
}
