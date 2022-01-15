package Exam.Preparations;

import java.util.Scanner;

public class Darts10032019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int initialPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;
        String sector = scan.nextLine();
        while (!sector.equals("Retire")){
            int points = Integer.parseInt(scan.nextLine());
            switch (sector){
                case "Double":
                    points *= 2;
                    break;
                case "Triple":
                    points *= 3;
                    break;
            }
            if (points <= initialPoints){
                initialPoints -= points;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }
            if (initialPoints == 0){
                break;
            }
            sector = scan.nextLine();
        }
        if (initialPoints == 0){
            System.out.printf("%s won the leg with %d shots.", name, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulShots);
        }
    }
}
