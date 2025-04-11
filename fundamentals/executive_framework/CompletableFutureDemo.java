package fundamentals.executive_framework;

public class CompletableFutureDemo {
  public static void show() {
    var service = new FlightService();
    service.getQuote("site1")
      .thenAccept(System.out::println);

      try {
        Thread.sleep(10_000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
  };
}
