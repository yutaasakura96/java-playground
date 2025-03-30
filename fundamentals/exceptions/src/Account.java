package fundamentals.exceptions.src;

import java.io.IOException;

public class Account {
  public void deposit(float value) throws IOException {
    if (value <= 0) {
      throw new IOException();
    }
  }
}
