package mortgagecalculator;

import java.text.NumberFormat;

public class Main {

  final static byte MONTHS_IN_YEAR = 12;
  final static byte PERCENT = 100;

  public static void main(String[] args) {
    int principal = 0;
    float annualInterest = 0;
    byte years = 0;

    principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
    annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
    years = (byte) Console.readNumber("Period (Years): ", 1, 30);

    MortgageReport.printMortgage(principal, annualInterest, years);
    MortgageReport.printPaymentSchedule(principal, annualInterest, years);
  }
}
