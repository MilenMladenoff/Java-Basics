package basics4.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actor = scan.nextLine();
        double initialPoints = Double.parseDouble(scan.nextLine());
        int jury = Integer.parseInt(scan.nextLine());

        double totalPoints = initialPoints;
        for (int i = 1; i <= jury; i++){
            String judgeName = scan.nextLine();
            double judgePoints = Double.parseDouble(scan.nextLine());
            double currentPoints = (judgeName.length() * judgePoints) / 2;

            if (totalPoints <= 1250.5){
                totalPoints = totalPoints + currentPoints;
            }
        }

        double diff = 1250.5 - totalPoints;
        if (totalPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        }
    }
}
