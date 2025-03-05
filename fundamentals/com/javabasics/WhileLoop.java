import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "";

    System.out.println("Type \"quit\" to exit the program");
    while (!input.equals("quit")) {
      System.out.print("Input: ");
      input = scanner.next().toLowerCase();
      System.out.println(input);
    }
  }
}
