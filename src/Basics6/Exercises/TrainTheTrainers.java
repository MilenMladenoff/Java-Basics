package Basics6.Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int gradesCount = 0;
        double allGradesSum = 0;
        while (!input.equals("Finish")){
            String presentationName = input;
            double currentGradesSum = 0;
            for (int i = 1; i <= n; i++){
                double currentGrade = Double.parseDouble(scan.nextLine());
                gradesCount++;
                allGradesSum += currentGrade;
                currentGradesSum += currentGrade;
            }
            System.out.printf("%s - %.2f.%n", presentationName, currentGradesSum / n);
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradesSum / gradesCount);

    }
}
