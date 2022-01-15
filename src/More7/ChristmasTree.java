package More7;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int row = 0; row <= n; row++){
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
