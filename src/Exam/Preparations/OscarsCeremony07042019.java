package Exam.Preparations;

import java.util.Scanner;

public class OscarsCeremony07042019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rent = Integer.parseInt(scan.nextLine());
        double statuettes = rent * 0.7;
        double catering = statuettes * 0.85;
        double sound = catering / 2;
        double totalSum = rent + statuettes + catering + sound;
        System.out.printf("%.2f", totalSum);
    }
}
