package Exam29032020;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rent = Double.parseDouble(scan.nextLine());
        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animation = rent / 3;
        double totalCost = rent + cake + drinks + animation;
        System.out.println(totalCost);
    }
}
