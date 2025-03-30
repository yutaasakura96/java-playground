package fundamentals.exceptions.src;

import java.io.IOException;

public class ExceptionsDemo {
  public static void show() throws IOException {
    var account = new Account();
    try {
      account.deposit(-1);
    } catch (IOException e) {
      System.out.println("Logging");
      throw e;
    }
  }

  /**
   * public static void show() { try (var reader = new FileReader("file.txt"); var writer = new
   * FileWriter("...");) { var value = reader.read(); } catch (IOException ex) {
   * System.out.println("Cold not read data"); } }
   **/
}
