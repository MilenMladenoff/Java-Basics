package Basics5.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int minNum = Integer.MAX_VALUE;
        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if (number < minNum){
                minNum = number;
            }
            input = scan.nextLine();
        }
        System.out.println(minNum);
    }
}
