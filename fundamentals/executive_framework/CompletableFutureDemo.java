package fundamentals.executive_framework;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
  public static CompletableFuture<String> getUserEmailAsync() {
    return CompletableFuture.supplyAsync(() -> "email");
  }

  public static CompletableFuture<String> getPlaylistAsync(String email) {
    return CompletableFuture.supplyAsync(() -> "playlist");
  }

  public static void show() {
    getUserEmailAsync().thenCompose(CompletableFutureDemo::getPlaylistAsync).thenAccept(playlist -> System.out.println(playlist));
  }
}
