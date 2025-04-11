package fundamentals.executive_framework;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
  public static int toFarenheit(int celsius) {
    return (int) ((celsius * 1.8) + 32);
  }

  public static void show() {
    var future = CompletableFuture.supplyAsync(() -> 20);
    future.thenApply(CompletableFutureDemo::toFarenheit).thenAccept(f -> System.out.println(f));
  }
}
