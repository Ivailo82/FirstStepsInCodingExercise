package FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPackage = Integer.parseInt(scanner.nextLine());
        int markerPackage = Integer.parseInt(scanner.nextLine());
        int ltrDetergent = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)
        double totalPenPrice = penPackage * 5.80;
        double totalMarkerPrice = markerPackage * 7.20;
        double totalDetergentPrice = ltrDetergent * 1.20;
        double totalSum = totalPenPrice + totalMarkerPrice + totalDetergentPrice;
        double totalSumWithDiscount = totalSum - (totalSum * percentDiscount / 100);
        System.out.printf("%f",totalSumWithDiscount);

    }
}
