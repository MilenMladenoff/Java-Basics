package Exam19072020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int maxGoals = 0;
        String winner = "";
        while (!input.equals("END")){
            String name = input;
            int goals = Integer.parseInt(scan.nextLine());
            if (goals > maxGoals){
                maxGoals = goals;
                winner = name;
            }
            if (maxGoals >= 10){
                break;
            }
            input = scan.nextLine();
        }
        System.out.printf("%s is the best player!%n", winner);
        if (maxGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
