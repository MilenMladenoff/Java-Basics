package Exam21042019;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scan.nextLine());
        int eggs = Integer.parseInt(scan.nextLine());
        int cookies = Integer.parseInt(scan.nextLine());
        double totalSum = easterBreads * 3.2 + cookies * 5.4 + eggs * 4.35 + eggs * 12 * 0.15;
        System.out.printf("%.2f", totalSum);
    }
}
