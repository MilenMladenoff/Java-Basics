package Exam.Preparations;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double totalMoney = 0;
        int totalWins = 0;
        int totalLoses = 0;
        for (int i = 1; i <= days; i++){
            double dailyMoney = 0;
            int dailyWins = 0;
            int dailyLoses = 0;
            String input = scan.nextLine();
            while (!input.equals("Finish")){
                String sport = input;
                String result = scan.nextLine();
                if (result.equals("win")){
                    dailyMoney += 20;
                    dailyWins++;
                } else {
                    dailyLoses++;
                }
                input = scan.nextLine();
            }
            if (dailyWins > dailyLoses){
                dailyMoney = dailyMoney * 1.1;
                totalWins++;
            } else {
                totalLoses++;
            }
            totalMoney += dailyMoney;
        }
        if (totalWins > totalLoses){
            totalMoney = totalMoney * 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}
