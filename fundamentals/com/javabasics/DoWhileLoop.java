import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberToGuess = 7;
    int userGuess;

    do {
      System.out.print("Guess the number (1-10): ");
      userGuess = scanner.nextInt();
      if (userGuess != numberToGuess) {
        System.out.println("Wrong guess, try again.");
      }
    } while (userGuess != numberToGuess);

    System.out.println("Congratulations! You guessed the right number.");
    scanner.close();
  }
}
