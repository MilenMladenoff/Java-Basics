package Exam.Preparations;

import java.util.Scanner;

public class MovieDay16062019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int availableTime = Integer.parseInt(scan.nextLine());
        int scenes = Integer.parseInt(scan.nextLine());
        int sceneTime = Integer.parseInt(scan.nextLine());

        double preparation = availableTime * 0.15;
        int allScenesTime = sceneTime * scenes;
        double neededTime = preparation + allScenesTime;

        if (availableTime >= neededTime){
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(availableTime - neededTime));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(neededTime - availableTime));
        }
    }
}
