package Basics5.Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int spaceWidth = Integer.parseInt(scan.nextLine());
        int spaceLength = Integer.parseInt(scan.nextLine());
        int spaceHeight = Integer.parseInt(scan.nextLine());
        int freeSpace = spaceHeight * spaceLength * spaceWidth;
        int allBoxes = 0;
        String input = scan.nextLine();
        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input);
            allBoxes += boxes;
            if (allBoxes >= freeSpace){
                break;
            }
            input = scan.nextLine();
        }
        int diff = Math.abs(freeSpace - allBoxes);
        if (freeSpace >= allBoxes){
            System.out.printf("%d Cubic meters left.", diff);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }
    }
}
