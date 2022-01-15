package Basics5.Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeLength = Integer.parseInt(scan.nextLine());
        int cakeCapacity = cakeLength * cakeWidth;
        int totalPieces = 0;
        String input = scan.nextLine();
        while (!input.equals("STOP")){
            int currentPieces = Integer.parseInt(input);
            totalPieces += currentPieces;
            if (totalPieces >= cakeCapacity){
                break;
            }
            input = scan.nextLine();
        }
        int diff = Math.abs(cakeCapacity - totalPieces);
        if (totalPieces <= cakeCapacity){
            System.out.printf("%d pieces are left.", diff);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", diff);
        }
    }
}
