package Exam.Preparations;

import java.util.Scanner;

public class EasterEggs21042019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggsQuantity = Integer.parseInt(scan.nextLine());
        int red = 0;
        int orange = 0;
        int green = 0;
        int blue = 0;
        for (int i = 1; i <= eggsQuantity; i++){
            String color = scan.nextLine();
            switch (color){
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "green":
                    green++;
                    break;
                case  "blue":
                    blue++;
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        if (red > orange && red > blue && red > green){
            System.out.printf("Max eggs: %d -> red", red);
        } else if (orange > red && orange > blue && orange > green){
            System.out.printf("Max eggs: %d -> orange", orange);
        } else if (green > red && green > blue && orange < green){
            System.out.printf("Max eggs: %d -> green", green);
        } else {
            System.out.printf("Max eggs: %d -> blue", blue);
        }
    }
}
