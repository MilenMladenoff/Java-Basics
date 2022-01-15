package basics4.More;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());
        int attendance = Integer.parseInt(scan.nextLine());
        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;
        for (int i = 1; i <= attendance; i++){
            String sector = scan.nextLine();
            switch (sector){
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
            }
        }
//        double sectorAPercentage = sectorA / attendance * 100.0;
//        double sectorBPercentage = sectorB / attendance * 100.0;
//        double sectorVPercentage = sectorV / attendance * 100.0;
//        double sectorGPercentage = sectorG / attendance * 100.0;
//        double attendancePercentage = (attendance * 1.0) / capacity * 100;
        System.out.printf("%.2f%%%n", sectorA / attendance * 100);
        System.out.printf("%.2f%%%n", sectorB / attendance * 100);
        System.out.printf("%.2f%%%n", sectorV / attendance * 100);
        System.out.printf("%.2f%%%n", sectorG / attendance * 100);
        System.out.printf("%.2f%%%n", (attendance * 1.0) / capacity * 100);
    }
}
