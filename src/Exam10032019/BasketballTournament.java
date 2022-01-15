package Exam10032019;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allGamesCounter = 0;
        int winsCounter = 0;
        int lossesCounter = 0;
        String tournamentName = scan.nextLine();
        while (!tournamentName.equals("End of tournaments")){
            int tournamentGames = Integer.parseInt(scan.nextLine());
            int tournamentGamesCounter = 0;
            for (int i = 1; i <= tournamentGames; i++){
                int dessyTeamPoints = Integer.parseInt(scan.nextLine());
                int rivalTeamPoints = Integer.parseInt(scan.nextLine());
                tournamentGamesCounter++;
                int diff = Math.abs(dessyTeamPoints - rivalTeamPoints);
                if (dessyTeamPoints > rivalTeamPoints){
                    winsCounter++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", tournamentGamesCounter, tournamentName, diff);
                } else {
                    lossesCounter++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", tournamentGamesCounter, tournamentName, diff);
                }
            }
            allGamesCounter += tournamentGamesCounter;
            tournamentName = scan.nextLine();
        }
        double winsPercentage = winsCounter * 1.0 / allGamesCounter * 100;
        double lossesPercentage = lossesCounter * 1.0 / allGamesCounter * 100;
        System.out.printf("%.2f%% matches win%n", winsPercentage);
        System.out.printf("%.2f%% matches lost", lossesPercentage);
    }
}
