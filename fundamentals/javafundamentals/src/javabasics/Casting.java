public class Casting {
  public static void main(String args[]) {
    byte x = 1;
    int y = 2;
    float z = (float) 24.555;
    String w = "3";

    // Implicit Casting
    System.out.println(x + y);

    System.out.println(z);

    // Explicit Casting
    System.out.println(Integer.parseInt(w) + y);
  }
}
