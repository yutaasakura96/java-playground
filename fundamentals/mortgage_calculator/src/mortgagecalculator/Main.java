package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

  final static byte MONTHS_IN_YEAR = 12;
  final static byte PERCENT = 100;

  public static void main(String[] args) {
    int principal = 0;
    float annualInterest = 0;
    byte years = 0;

    principal = (int) readNumber("Principal: ", 1000, 1_000_000);
    annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    years = (byte) readNumber("Period (Years): ", 1, 30);

    printMortgage(principal, annualInterest, years);
    printPaymentSchedule(principal, annualInterest, years);
  }

  private static void printMortgage(int principal, float annualInterest, byte years) {
    double mortgage = calculateMortgage(principal, annualInterest, years);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
      double balance = calculateBalance(principal, annualInterest, years, month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }

  public static double readNumber(String prompt, int min, int max) {
    Scanner scanner = new Scanner(System.in);
    double value;

    while (true) {
      System.out.print(prompt);
      value = scanner.nextInt();
      if (value >= min && value <= max)
        break;
      System.out.println("Enter a value between" + min + " and " + max);
    }
    return value;
  }


  public static double calculateBalance(int principal, float annualInterest, byte years,
      short NumberOfPaymentsMade) {

    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments)
            - Math.pow(1 + monthlyInterest, NumberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  public static double calculateMortgage(int principal, float annualInterest, byte years) {

    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

    double mortgage =
        principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }
}
