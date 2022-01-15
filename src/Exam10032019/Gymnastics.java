package Exam10032019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String item = scan.nextLine();
        double points = 0;
        switch (country){
            case "Russia":
                if (item.equals("ribbon")){
                    points = 9.1 + 9.4;
                } else if (item.equals("hoop")){
                    points = 9.3 + 9.8;
                } else {
                    points = 9.6 + 9;
                }
                break;
            case "Bulgaria":
                if (item.equals("ribbon")){
                    points = 9.6 + 9.4;
                } else if (item.equals("hoop")){
                    points = 9.55 + 9.75;
                } else {
                    points = 9.5 + 9.4;
                }
                break;
            case "Italy":
                if (item.equals("ribbon")){
                    points = 9.2 + 9.5;
                } else if (item.equals("hoop")){
                    points = 9.45 + 9.35;
                } else {
                    points = 9.7 + 9.15;
                }
                break;
        }
        double percentTo20 = (20 - points) / 20 * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, points, item);
        System.out.printf("%.2f%%", percentTo20);
    }
}
