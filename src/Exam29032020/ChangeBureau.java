package Exam29032020;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scan.nextLine());
        double renminbies = Double.parseDouble(scan.nextLine());
        double commission = Double.parseDouble(scan.nextLine());
        int bitcoinsInlevs = bitcoins * 1168;
        double renminbiesInDollars = renminbies * 0.15;
        double dollarsInlevs = renminbiesInDollars * 1.76;
        double allLevs = dollarsInlevs + bitcoinsInlevs;
        double levsInEuro = allLevs / 1.95;
        double commissionAmount = levsInEuro * commission / 100;
        double totalEuro = levsInEuro - commissionAmount;
        System.out.printf("%.2f", totalEuro);
    }
}
