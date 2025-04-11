package fundamentals.executive_framework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
  public static void show() {
    var first = CompletableFuture.supplyAsync(() -> 1);
    var second = CompletableFuture.supplyAsync(() -> 2);
    var third = CompletableFuture.supplyAsync(() -> 3);

    var all = CompletableFuture.allOf(first, second, third);
    try {
      var firstResult = first.get();
      System.out.println(firstResult);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

    all.thenRun(() -> System.out.println("All tasks completed succesfully"));

  }
}
