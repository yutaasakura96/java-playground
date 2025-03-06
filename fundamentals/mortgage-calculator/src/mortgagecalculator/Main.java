package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int principal = 0;
    float annualInterest = 0;
    byte years = 0;

    principal = (int) readNumber("Principal: ", 1000, 1_000_000);
    annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    years = (byte) readNumber("Period (Years): ", 1, 30);

    double mortgage = calculateMortgage(principal, annualInterest, years);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);
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

  public static double calculateMortgage(int principal, float annualInterest, byte years) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

    double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }
}
