package fundamentals.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo {
  public static void show() {
    List<Thread> threads = new ArrayList<>();
    List<DownloadFileTask> tasks = new ArrayList<>();

    for (var i = 0; i < 10; i++) {
      var task = new DownloadFileTask();
      tasks.add(task);
      var thread = new Thread(task);
      thread.start();
      threads.add(thread);
    }

    for (var thread : threads) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    Integer totalBytes = tasks.stream().map(t -> t.getStatus().getTotalBytes()).reduce(0, Integer::sum);

    System.out.println(totalBytes);
  }
}
