package Basics5.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int failedThreshold = Integer.parseInt(scan.nextLine());
        int gradesCount = 0;
        int poorGradesCount = 0;
        int gradesSum = 0;
        boolean isFailed = true;
        String lastProblem = "";
        while (poorGradesCount < failedThreshold){
            String problemName = scan.nextLine();
            if (problemName.equals("Enough")){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scan.nextLine());
            if (grade <= 4){
                poorGradesCount++;
            }
            gradesSum += grade;
            gradesCount++;
            lastProblem = problemName;
        }
        double averageGrade = (gradesSum * 1.0) / gradesCount;
        if (!isFailed){
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", averageGrade, gradesCount, lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        }
    }
}
