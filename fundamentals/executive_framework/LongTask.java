package fundamentals.executive_framework;

public class LongTask {
  public static void simulate() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
