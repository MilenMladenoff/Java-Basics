package basics4.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int highestNum = Integer.MIN_VALUE;
        int lowestNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            int numbers = Integer.parseInt(scan.nextLine());
            if (highestNum < numbers){
                highestNum = numbers;
            }
            if (lowestNum > numbers){
                lowestNum = numbers;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d", highestNum, lowestNum);
    }
}
