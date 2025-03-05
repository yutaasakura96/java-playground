package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal ($1K - $1M): ");
    int principal = scanner.nextInt();
    while (principal < 1000 || principal > 1_000_000) {
      System.out.println("Please enter a number between 1,000 and 1,000,000.");
      principal = scanner.nextInt();
    }

    System.out.print("Annual Interest Rate: ");
    float annualInterest = scanner.nextFloat();
    while (annualInterest <= 0 || annualInterest > 30) {
      System.out.println("Please enter a value greater than 0 and less than or equal to 30.");
      annualInterest = scanner.nextFloat();
    }
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

    System.out.print("Period (Years): ");
    byte years = scanner.nextByte();
    while (years < 1 || years > 30) {
      System.out.print("Period (Years): ");
      years = scanner.nextByte();
    }
    int numberOfPayments = years * MONTHS_IN_YEAR;

    double mortgage =
        principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);
  }
}


