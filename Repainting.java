package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paintLtr = Integer.parseInt(scanner.nextLine());
        int thinnerLtr = Integer.parseInt(scanner.nextLine());
        int hoursToWork = Integer.parseInt(scanner.nextLine());
        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paintLtr * 1.10) * 14.50;
        double thinnerPrice = thinnerLtr * 5.00;
        double totalMaterialPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double hourPrice = totalMaterialPrice * 0.30;
        double totalHourPrice = hoursToWork * hourPrice;
        double totalAllPrice = totalMaterialPrice + totalHourPrice;
        System.out.printf("%.2f",totalAllPrice);
    }
}
