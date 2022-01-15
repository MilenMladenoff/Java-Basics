package Basics5.Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int targetSteps = 10000;
        int totalSteps = 0;
        String input = scan.nextLine();
        while (!input.equals("Going home")){
            int currentSteps = Integer.parseInt(input);
            totalSteps += currentSteps;
            if (totalSteps >= targetSteps){
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Going home")){
            int stepsToHome = Integer.parseInt(scan.nextLine());
            totalSteps += stepsToHome;
        }
        int diff = Math.abs(targetSteps - totalSteps);
        if (totalSteps >= targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
