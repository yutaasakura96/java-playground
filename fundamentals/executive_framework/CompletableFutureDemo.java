package fundamentals.executive_framework;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
  public static void show() {
    var first = CompletableFuture.supplyAsync(() -> {
      LongTask.simulate();
      return 20;
    });

    var second = CompletableFuture.supplyAsync(() -> {
      return 20;
    });

    CompletableFuture.anyOf(first, second)
      .thenAccept(temp -> System.out.println(temp));
  };
}
