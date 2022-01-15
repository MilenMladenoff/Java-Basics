package Exam10032019;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int customers = Integer.parseInt(scan.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        for (int i = 1; i <= customers; i++){
            String act = scan.nextLine();
            switch (act){
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    break;
            }
        }
        double trainingPercent = (back + chest + legs + abs) * 1.0 / customers * 100;
        double proteinPercent = (proteinShake + proteinBar) * 1.0 / customers * 100;
        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", trainingPercent);
        System.out.printf("%.2f%% - protein", proteinPercent);
    }
}
