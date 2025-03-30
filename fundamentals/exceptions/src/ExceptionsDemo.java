package fundamentals.exceptions.src;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
  public static void show() {
    try {
      var reader = new FileReader("file.txt");
      var value = reader.read();
    } catch ( IOException ex) {
      System.out.println("Cold not read data");
    }
  }

}
