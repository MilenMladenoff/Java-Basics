package Exam07072019;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int noPaintPercent = Integer.parseInt(scan.nextLine());
        int allWallsArea = height * width * 4;
        double areaForPainting = Math.ceil(allWallsArea - (allWallsArea * (noPaintPercent * 1.0 / 100)));
        String input = scan.nextLine();
        while (!input.equals("Tired!")){
            int currentLitersPaint = Integer.parseInt(input);
            areaForPainting -= currentLitersPaint;
            if (areaForPainting <= 0){
                break;
            }
            input = scan.nextLine();
        }
        if (areaForPainting > 0){
            System.out.printf("%.0f quadratic m left.", areaForPainting);
        } else if (areaForPainting < 0){
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaForPainting));
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
