package basics4.More;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = Integer.parseInt(scan.nextLine());
        double gradesSum = 0;
        double f = 0;
        double c = 0;
        double b = 0;
        double a = 0;
        for (int i = 1; i <= students; i++){
            double grade = Double.parseDouble(scan.nextLine());
            gradesSum += grade;
            if (grade < 3){
                f++;
            } else if (grade < 4){
                c++;
            } else if (grade < 5){
                b++;
            } else {
                a++;
            }
        }
        double average = gradesSum / students;
        System.out.printf("Top students: %.2f%%%n", a / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", b / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", c / students * 100);
        System.out.printf("Fail: %.2f%%%n", f / students * 100);
        System.out.printf("Average: %.2f%n", average);
    }
}
