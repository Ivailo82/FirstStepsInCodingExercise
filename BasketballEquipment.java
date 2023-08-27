package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearPrice = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = yearPrice * 0.60;
        double outfitPrice = sneakersPrice * 0.80;
        double ballPrice = outfitPrice / 4;
        double accessoriesPrice = ballPrice / 5;
        double totalExpenses = yearPrice + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;
        System.out.printf("%.2f",totalExpenses);

    }
}
