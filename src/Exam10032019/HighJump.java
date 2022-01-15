package Exam10032019;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = Integer.parseInt(scan.nextLine());
        boolean isFailed = false;
        int jumpsCounter = 0;
        for (int i = target - 30; i <= target; i += 5){
            for (int j = 1; j <= 3; j++){
                int currentJump = Integer.parseInt(scan.nextLine());
                jumpsCounter++;
                if (currentJump > i){
                    break;
                }
                if (j == 3){
                    isFailed = true;
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", i, jumpsCounter);
                    break;
                }
            }
            if (isFailed){
                break;
            }
        }
        if (!isFailed){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", target, jumpsCounter);
        }
    }
}
