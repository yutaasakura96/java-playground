package javabasics;

import java.text.NumberFormat;

public class FormattingNumbers {
  public static void main(String[] args) {
      System.out.println("Formatting number 12412412411412 using NumberFormat.getCurrencyInstance() " + NumberFormat.getCurrencyInstance().format(12412412411412L));

      System.out.println("Formatting number 0.25 using NumberFormat.getPercentInstance() " + NumberFormat.getPercentInstance().format(0.25));
  }
}
