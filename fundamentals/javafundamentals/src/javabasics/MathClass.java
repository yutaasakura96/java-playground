package javabasics;

public class MathClass {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    float z = (float) 24.555;

    System.out.println("Math.max result: " + Math.max(x, y));
    System.out.println("Math.min result: " + Math.min(x, y));
    System.out.println("Math.floor result: " + Math.floor((double)z));
    System.out.println("Math.ceil result: " + Math.ceil((double)z));
    System.out.println("Math.random result: " + Math.random());
    System.out.println("Generating a random number between 0 and 100: " + (int) (Math.random() * 100));
  }
}
