package BasicsExam18122021;

import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paintBoxes = Integer.parseInt(scan.nextLine());
        int wallpaperRolls = Integer.parseInt(scan.nextLine());
        double glovesPrice = Double.parseDouble(scan.nextLine());
        double brushPrice = Double.parseDouble(scan.nextLine());
        double allPaintPrice = 21.5 * paintBoxes;
        double allWallpaperPrice = 5.2 * wallpaperRolls;
        double gloves = Math.ceil(wallpaperRolls * 0.35);
        double brushes = Math.floor(paintBoxes * 0.48);
        double allGlovesPrice = glovesPrice * gloves;
        double allBrushesPrice = brushPrice * brushes;
        double totalPrice = allBrushesPrice + allGlovesPrice + allPaintPrice + allWallpaperPrice;
        double delivery = totalPrice / 15;
        System.out.printf("This delivery will cost %.2f lv.", delivery);

    }
}
