package Basics6.Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int currentNum = 1;
        boolean flag = false;
        for (int rows = 1; rows <= n; rows++){
            for (int cols = 1; cols <= rows; cols++){
                if (currentNum > n){
                    flag = true;
                    break;
                }
                System.out.print(currentNum + " ");
                currentNum++;
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
