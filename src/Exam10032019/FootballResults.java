package Exam10032019;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String game1Result = scan.nextLine();
        String game2Result = scan.nextLine();
        String game3Result = scan.nextLine();
        char game1Num1 = game1Result.charAt(0);
        char game1Num2 = game1Result.charAt(2);
        char game2Num1 = game2Result.charAt(0);
        char game2Num2 = game2Result.charAt(2);
        char game3Num1 = game3Result.charAt(0);
        char game3Num2 = game3Result.charAt(2);
        int winsCounter = 0;
        int lossesCounter = 0;
        int drawsCounter = 0;
        if (game1Num1 > game1Num2){
            winsCounter++;
        } else if (game1Num1 == game1Num2){
            drawsCounter++;
        } else {
            lossesCounter++;
        }
        if (game2Num1 > game2Num2){
            winsCounter++;
        } else if (game2Num1 == game2Num2){
            drawsCounter++;
        } else {
            lossesCounter++;
        }
        if (game3Num1 > game3Num2){
            winsCounter++;
        } else if (game3Num1 == game3Num2){
            drawsCounter++;
        } else {
            lossesCounter++;
        }
        System.out.printf("Team won %d games.%n", winsCounter);
        System.out.printf("Team lost %d games.%n", lossesCounter);
        System.out.printf("Drawn games: %d", drawsCounter);
    }
}
