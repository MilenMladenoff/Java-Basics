package Basics1.More;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double columns = (h - 1) / 0.7;
        double rows = w / 1.2;
        int columnsInt = (int) columns;
        int rowsInt = (int) rows;
        int seats = columnsInt * rowsInt - 3;
        System.out.println(seats);

    }
}
