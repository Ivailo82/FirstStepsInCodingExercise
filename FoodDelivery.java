package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veganMenuPrice = veganMenu * 8.15;
        double desertPrice = (chickenMenuPrice + fishMenuPrice + veganMenuPrice) * 0.20;
        double totalOrderPrice = chickenMenuPrice + fishMenuPrice + veganMenuPrice + desertPrice + 2.50;
        System.out.printf("%.2f",totalOrderPrice);

    }
}
