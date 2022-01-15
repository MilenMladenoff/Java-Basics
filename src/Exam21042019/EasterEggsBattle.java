package Exam21042019;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int player1Eggs = Integer.parseInt(scan.nextLine());
        int player2Eggs = Integer.parseInt(scan.nextLine());
        String battleResult = scan.nextLine();
        while (!battleResult.equals("End of battle")){
            if (battleResult.equals("one")){
                player2Eggs--;
            } else {
                player1Eggs--;
            }
            if (player1Eggs == 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", player2Eggs);
                break;
            }
            if (player2Eggs == 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", player1Eggs);
                break;
            }
            battleResult = scan.nextLine();
        }
        if (battleResult.equals("End of battle")){
            System.out.printf("Player one has %d eggs left.%n", player1Eggs);
            System.out.printf("Player two has %d eggs left.", player2Eggs);
        }
    }
}
