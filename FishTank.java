package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentBusy = Double.parseDouble(scanner.nextLine());
        int totalVolume = length * width * height;
        double totalVolumeInLtr = 1.0 * totalVolume / 1000;
        double needLtr = totalVolumeInLtr - totalVolumeInLtr * (percentBusy / 100);
        System.out.printf("%f",needLtr);

    }
}
