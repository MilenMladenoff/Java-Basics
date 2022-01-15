package Exam21042019;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scan.nextLine());
        String winner = "";
        int maxPoints = 0;
        for (int i = 1; i <= easterBreads; i++){
            String chefsName = scan.nextLine();
            int chefsPoints = 0;
            String input = scan.nextLine();
            while (!input.equals("Stop")){
                int currentPoints = Integer.parseInt(input);
                chefsPoints += currentPoints;
                input = scan.nextLine();
            }
            System.out.printf("%s has %d points.%n", chefsName, chefsPoints);
            if (chefsPoints > maxPoints){
                maxPoints = chefsPoints;
                winner = chefsName;
                System.out.printf("%s is the new number 1!%n", chefsName);
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxPoints);
    }
}
