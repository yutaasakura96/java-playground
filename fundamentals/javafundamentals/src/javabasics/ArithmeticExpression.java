package javabasics;

public class ArithmeticExpression {
  public static void main(String args[]) {
    int a = 10;
    int b = 5;

    System.out.println("Addition: " + addition(a, b));
    System.out.println("Subtraction: " + subtraction(a, b));
    System.out.println("Multiplication: " + multiplication(a, b));
    System.out.println("Division: " + division(a, b));
    System.out.println("Modulus: " + modulus(a, b));

    // Augmented assignment operators
    a += b;
    System.out.println("a += b: " + a);

    a -= b;
    System.out.println("a -= b: " + a);

    a *= b;
    System.out.println("a *= b: " + a);

    a /= b;
    System.out.println("a /= b: " + a);

    a %= b;
    System.out.println("a %= b: " + a);
  }

  public static int addition(int x, int y) {
    return x + y;
  }

  public static int subtraction(int x, int y) {
    return x - y;
  }

  public static int multiplication(int x, int y) {
    return x * y;
  }

  public static int division(int x, int y) {
    if (y == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    }
    return x / y;
  }

  public static int modulus(int x, int y) {
    return x % y;
  }
}
