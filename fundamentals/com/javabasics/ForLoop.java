public class ForLoop {
  public static void main(String[] args) {
    System.out.println("Counting forward from 1 to 10");
    for (int i = 1; i < 11; i++) {
        System.out.println("Count: " + i);
    }
    System.out.println("Counting backwards from 10 to 1");
    for (int i = 10; i > 0; i--) {
      System.out.println("Count: " + i);
    }
  }
}
