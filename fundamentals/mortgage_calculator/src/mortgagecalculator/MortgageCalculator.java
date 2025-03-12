package mortgagecalculator;

public class MortgageCalculator {

  private int principal;
  private float annualInterest;
  private byte years;

  public MortgageCalculator(int principal, float annualInterest, byte years) {
    this.principal = principal;
    this.annualInterest = annualInterest;
    this.years = years;
  }

 double calculateBalance(short NumberOfPaymentsMade) {

    float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
    short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);

    double balance = principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments)
            - Math.pow(1 + monthlyInterest, NumberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return balance;
  }

  public double calculateMortgage() {

    float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
    short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);

    double mortgage =
        principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }

    public short getYears() {
      return years;
    }

}
