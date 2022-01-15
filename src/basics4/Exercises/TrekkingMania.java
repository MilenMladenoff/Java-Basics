package basics4.Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.parseInt(scan.nextLine());

        double musala = 0;
        double montBlanc = 0;
        double kilimanjaro =0;
        double k2 = 0;
        double everest = 0;
        int allPeople = 0;
        for (int i = 1; i <= groups; i++){
            int groupMembers = Integer.parseInt(scan.nextLine());
            allPeople += groupMembers;

            if (groupMembers <= 5){
                musala += groupMembers;
            } else if (groupMembers <= 12){
                montBlanc += groupMembers;
            } else if (groupMembers <= 25){
                kilimanjaro += groupMembers;
            } else if (groupMembers <= 40){
                k2 += groupMembers;
            } else {
                everest += groupMembers;
            }
        }

        System.out.printf("%.2f%%%n", musala / allPeople * 100);
        System.out.printf("%.2f%%%n", montBlanc / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro / allPeople * 100);
        System.out.printf("%.2f%%%n", k2 / allPeople * 100);
        System.out.printf("%.2f%%%n", everest / allPeople * 100);
    }
}
