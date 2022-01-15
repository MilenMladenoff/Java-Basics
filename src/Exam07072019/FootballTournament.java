package Exam07072019;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String teamName = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());
        int wins = 0;
        int draws = 0;
        int losses = 0;
        int points = 0;
        for (int i = 1; i <= games; i++){
            char gameResult = scan.nextLine().charAt(0);
            if (gameResult == 'W'){
                wins++;
                points += 3;
            } else if (gameResult == 'D'){
                draws++;
                points++;
            } else {
                losses++;
            }
        }
        double winsPercentage = wins * 1.0 / games * 100;
        if (games == 0){
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            System.out.printf("%s has won %d points during this season.%n", teamName, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", wins);
            System.out.printf("## D: %d%n", draws);
            System.out.printf("## L: %d%n", losses);
            System.out.printf("Win rate: %.2f%%", winsPercentage);
        }
    }
}
