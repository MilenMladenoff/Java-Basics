package basics4.More;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cargos = Integer.parseInt(scan.nextLine());

        int minibus = 0;
        int truck = 0;
        int train = 0;
        int wholeWeight = 0;
        for (int i = 1; i <= cargos; i++){
            int weight = Integer.parseInt(scan.nextLine());
            wholeWeight += weight;
            if (weight <= 3){
                minibus += weight;
            } else if (weight <= 11){
                truck += weight;
            } else {
                train += weight;
            }
        }
        double averagePrice = (minibus * 200 + truck * 175 + train * 120.0) / wholeWeight;
        double minibusPercentage = (minibus * 1.0) / wholeWeight * 100;
        double truckPercentage = (truck * 1.0) / wholeWeight * 100;
        double trainPercentage = (train * 1.0) / wholeWeight * 100;
        System.out.printf("%.2f%n%.2f%%%n%.2f%%%n%.2f%%%n", averagePrice, minibusPercentage, truckPercentage, trainPercentage);
    }
}
