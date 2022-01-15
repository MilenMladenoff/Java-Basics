package More7;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++){
            System.out.print("**");
        }
        for (int i = 1; i <= n; i++){
            System.out.print(" ");
        }
        for (int i = 1; i <= n; i++){
            System.out.print("**");
        }
        System.out.println();
        for (int row = 1; row < n - 1; row++){
            System.out.print("*");
            for (int col = 1; col < n; col++){
                System.out.print("//");
            }
            System.out.print("*");
            if (row == (n - 1) / 2){
                for (int col = 1; col <= n; col++){
                    System.out.print("|");
                }
            } else {
                for (int col = 1; col <= n; col++){
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int col = 1; col < n; col++){
                System.out.print("//");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= n; i++){
            System.out.print("**");
        }
        for (int i = 1; i <= n; i++){
            System.out.print(" ");
        }
        for (int i = 1; i <= n; i++){
            System.out.print("**");
        }
    }
}
