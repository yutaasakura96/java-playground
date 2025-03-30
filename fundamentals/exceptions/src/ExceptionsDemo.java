package fundamentals.exceptions.src;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
  public static void show() {
    try {
      var reader = new FileReader("file.txt");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void sayHello(String name) {
    System.out.println(name.toUpperCase());
  }
}
