package fundamentals.concurrency;

public class ThreadsDemo {
  public static void show() {
    var status = new DownloadStatus();
    var thread1 = new Thread(new DownloadFileTask(status));
    var thread2 = new Thread(() -> {
      while (!status.isDone()) {
        System.out.println(status.getTotalBytes());
      }
    });

    thread1.start();
    thread2.start();
  }
}
