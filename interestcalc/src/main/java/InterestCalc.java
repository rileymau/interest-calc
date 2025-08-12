package main;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InterestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("===Simple Interest Calcualtor===");

            System.out.print("Enter principal amount: ");
            double principal = InputValidator.parseDouble(scanner.nextLine(), "Principal");

            System.out.print("Enter interest rate for one time period as a percent: ");
            double rate = InputValidator.parseDouble(scanner.nextLine(), "Rate");

            System.out.print("Enter the number of time periods: ");
            double time = InputValidator.parseDouble(scanner.nextLine(), "Time");

            /**
             * Calulate the interest based on the principal, rate, and time periods above
             */
            double interest = calculateSimpleInterest(principal, rate, time);
            System.out.printf("Simple Interest: %.2f\n", interest);

        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    /**
     * Calculates simple interest using the formula PxRxT / 100
     */
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}