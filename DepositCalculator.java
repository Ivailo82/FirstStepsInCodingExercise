package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountDeposited = Double.parseDouble(scanner.nextLine());
        int session = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double totalSum = amountDeposited + (session * (amountDeposited * annualInterestRate / 100) / 12);
        System.out.printf("%.2f",totalSum);
    }
}
