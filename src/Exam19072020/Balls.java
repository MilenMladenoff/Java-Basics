package Exam19072020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double points = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int other = 0;
        int black = 0;
        for (int i = 1; i <= n; i++){
            String color = scan.nextLine();
            switch (color){
                case "red":
                    red++;
                    points += 5;
                    break;
                case "orange":
                    orange++;
                    points += 10;
                    break;
                case "yellow":
                    yellow++;
                    points += 15;
                    break;
                case "white":
                    white++;
                    points += 20;
                    break;
                case "black":
                    black++;
                    points /= 2;
                    break;
                default:
                    other++;
                    break;
            }
        }
        System.out.printf("Total points: %.0f%n", Math.floor(points));
        System.out.printf("Red balls: %d%nOrange balls: %d%nYellow balls: %d%nWhite balls: %d%nOther colors picked: %d%nDivides from black balls: %d", red, orange, yellow, white, other, black);
    }
}
