package Basics5.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentName = scan.nextLine();
        double gradesSum = 0;
        double poorGrade = 0;
        int year = 1;
        while (year <= 12){
            if (poorGrade == 2){
                break;
            }
            double grade = Double.parseDouble(scan.nextLine());
            if (grade < 4){
                poorGrade++;
                continue;
            }
            year++;
            gradesSum += grade;
        }
        if (year > 12){
            System.out.printf("%s graduated. Average grade: %.2f", studentName, gradesSum /12);
        } else {
            System.out.printf("%s has been excluded at %d grade", studentName, year);
        }

    }
}
