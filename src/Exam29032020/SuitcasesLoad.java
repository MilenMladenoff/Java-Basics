package Exam29032020;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cargoCapacity = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        int suitcasesCounter = 0;
        while (!input.equals("End")){
            double currentSuitcaseVolume = Double.parseDouble(input);
            suitcasesCounter++;
            if (suitcasesCounter % 3 == 0){
                currentSuitcaseVolume *= 1.1;
            }
            cargoCapacity -= currentSuitcaseVolume;
            if (cargoCapacity <= 0){
                suitcasesCounter = suitcasesCounter - 1;
                break;
            }
            input = scan.nextLine();
        }
        if (cargoCapacity < 0){
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcasesCounter);
    }
}
