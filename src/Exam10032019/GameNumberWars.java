package Exam10032019;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player1Name = scan.nextLine();
        String player2Name = scan.nextLine();
        String input = scan.nextLine();
        int player1Score = 0;
        int player2Score = 0;
        String winner = "";
        int winnerScore = 0;
        while (!input.equals("End of game")){
            int player1Card = Integer.parseInt(input);
            int player2Card = Integer.parseInt(scan.nextLine());
            int player1CurrentPoints = 0;
            int player2CurrentPoints = 0;
            if (player1Card > player2Card){
                player1CurrentPoints = player1Card - player2Card;
                player1Score += player1CurrentPoints;
            } else if (player1Card < player2Card){
                player2CurrentPoints = player2Card - player1Card;
                player2Score += player2CurrentPoints;
            } else {
                player1Card = Integer.parseInt(scan.nextLine());
                player2Card = Integer.parseInt(scan.nextLine());
                if (player1Card > player2Card){
                    winner = player1Name;
                    winnerScore = player1Score;
                } else {
                    winner = player2Name;
                    winnerScore = player2Score;
                }
                break;
            }
            input = scan.nextLine();
        }
        if (!input.equals("End of game")){
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points", winner, winnerScore);
        } else {
            System.out.printf("%s has %d points%n", player1Name, player1Score);
            System.out.printf("%s has %d points", player2Name, player2Score);
        }
    }
}
