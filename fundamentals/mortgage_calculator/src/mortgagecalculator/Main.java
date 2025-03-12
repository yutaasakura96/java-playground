package mortgagecalculator;

public class Main {

  public static void main(String[] args) {
    int principal = 0;
    float annualInterest = 0;
    byte years = 0;

    principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
    annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
    years = (byte) Console.readNumber("Period (Years): ", 1, 30);

    var calculator = new MortgageCalculator(principal, annualInterest, years);
    var report = new MortgageReport(calculator);
    report.printMortgage();
    report.printPaymentSchedule();
  }
}
