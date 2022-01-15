package More7;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.print("+ ");
        for (int i = 1; i <= n - 2; i++){
            System.out.print("- ");
        }
        System.out.println("+ ");
        for (int j = 1; j <= n - 2; j++){
            System.out.print("| ");
            for (int k = 1; k <= n - 2; k++){
                System.out.print("- ");
            }
            System.out.println("| ");
        }
        System.out.print("+ ");
        for (int i = 1; i <= n - 2; i++){
            System.out.print("- ");
        }
        System.out.println("+ ");
    }
}
