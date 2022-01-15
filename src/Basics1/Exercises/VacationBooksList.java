package Basics1.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int speed = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int hours = pages / speed;

        int hoursPerDay = hours / days;

        System.out.println(hoursPerDay);
    }
}
