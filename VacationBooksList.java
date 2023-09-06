package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPages = Integer.parseInt(scanner.nextLine());
        int oneHourPages = Integer.parseInt(scanner.nextLine());
        int dayForRead = Integer.parseInt(scanner.nextLine());
        int totalTimeForAllPages = allPages / oneHourPages;
        int totalDayForRead = totalTimeForAllPages / dayForRead;
        System.out.printf("%d",totalDayForRead);

    }
}
