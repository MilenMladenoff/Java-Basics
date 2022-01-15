package More7;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++){
            String row = "";
            for (int j = 1; j <= n; j++){
                row = row + "* ";
                if (j == n){
                    System.out.println(row);
                }
            }
        }
    }
}
