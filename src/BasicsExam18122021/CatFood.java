package BasicsExam18122021;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double allFood = 0;
        int allCats = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= allCats; i++){
            double currentCatFood = Double.parseDouble(scan.nextLine());
            allFood += currentCatFood;
            if (currentCatFood < 200){
                group1++;
            } else if (currentCatFood < 300){
                group2++;
            } else {
                group3++;
            }
        }
        double foodPrice = (allFood / 1000) * 12.45;
        System.out.printf("Group 1: %d cats.%nGroup 2: %d cats.%nGroup 3: %d cats.%nPrice for food per day: %.2f lv.", group1, group2, group3, foodPrice);

    }
}
