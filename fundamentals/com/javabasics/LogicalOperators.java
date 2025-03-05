public class LogicalOperators {

  public static void main(String[] args) {
    double temperature = Math.random() * 100;
    boolean isHot = temperature > 30;
    boolean isCold = temperature < 10;

    // Logical AND (&&)
    if (isHot && !isCold) {
      System.out.println("It's hot and not cold.");
    }

    // Logical OR (||)
    if (isHot || isCold) {
      System.out.println("It's either hot or cold.");
    }

    // Logical NOT (!)
    if (!isHot) {
      System.out.println("It's not hot.");
    }

    // Print the temperature
    System.out.printf("Temperature: %.2f%n", temperature);
  }
}
