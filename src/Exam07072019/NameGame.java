package Exam07072019;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int maxPoints = 0;
        String winner = "";
        while (!name.equals("Stop")){
            int points = 0;
            for (int i = 0; i < name.length(); i++){
                char letter = name.charAt(i);
                int currentNum = Integer.parseInt(scan.nextLine());
                if (letter == currentNum){
                    points += 10;
                } else {
                    points += 2;
                }
                if (maxPoints <= points){
                    maxPoints = points;
                    winner = name;
                }
            }
            name = scan.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
