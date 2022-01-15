package basics4.More;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allMoves = Integer.parseInt(scan.nextLine());
        double group0 = 0;
        double group10 = 0;
        double group20 = 0;
        double group30 = 0;
        double group40 = 0;
        double invalid = 0;
        double result = 0;
        for (int i = 0; i < allMoves; i++){
            int number = Integer.parseInt(scan.nextLine());
            if (number >= 0 && number <=9){
                group0++;
                result = result + number * 0.2;
            } else if (number >= 10 && number <=19){
                group10++;
                result = result + number * 0.3;
            } else if (number >= 20 && number <=29){
                group20++;
                result = result + number * 0.4;
            } else if (number >= 30 && number <=39){
                group30++;
                result = result + 50;
            } else if (number >= 40 && number <=50){
                group40++;
                result = result + 100;
            } else {
                invalid++;
                result = result / 2;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", group0 / allMoves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", group10 / allMoves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", group20 / allMoves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", group30 / allMoves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", group40 / allMoves * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalid / allMoves * 100);
    }
}
