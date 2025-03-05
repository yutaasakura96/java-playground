public class TernaryOperator {
  public static void main(String[] args) {
      long income = (long) Math.random() * 100_000;
      String className = income > 80_000 ? "First Class" : "Economy Class";
      System.out.println("You will be boarding the plane in " + className);
  }
}
