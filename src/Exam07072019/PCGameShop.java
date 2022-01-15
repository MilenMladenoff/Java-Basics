package Exam07072019;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int heartstoneCounter = 0;
        int forniteCounter = 0;
        int overwatchCounter = 0;
        int othersCounter = 0;
        for (int i = 1; i <= n; i++){
            String gameName = scan.nextLine();
            switch (gameName){
                case "Hearthstone":
                    heartstoneCounter++;
                    break;
                case "Fornite":
                    forniteCounter++;
                    break;
                case "Overwatch":
                    overwatchCounter++;
                    break;
                default:
                    othersCounter++;
                    break;
            }
        }
        double heartstonePercent = heartstoneCounter * 1.0 / n * 100;
        double fornitePercent = forniteCounter * 1.0 / n * 100;
        double overwatchPercent = overwatchCounter * 1.0 / n * 100;
        double othersPercent = othersCounter * 1.0 / n * 100;
        System.out.printf("Hearthstone - %.2f%%%n", heartstonePercent);
        System.out.printf("Fornite - %.2f%%%n", fornitePercent);
        System.out.printf("Overwatch - %.2f%%%n", overwatchPercent);
        System.out.printf("Others - %.2f%%%n", othersPercent);
    }
}
