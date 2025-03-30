package fundamentals.exceptions.src;

public class Main {

  public static void main(String[] args) {
    try {
      ExceptionsDemo.show();
    } catch (Throwable e) {
      System.out.println("An unexpected error occured.");
    }
  }
}
