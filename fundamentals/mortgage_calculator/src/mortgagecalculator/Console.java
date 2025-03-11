package mortgagecalculator;

import java.util.Scanner;

public class Console {
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
}
