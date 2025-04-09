package fundamentals.concurrency;

public class ThreadsDemo {
  public static void show() {
    var status = new DownloadStatus();
    var thread1 = new Thread(new DownloadFileTask(status));
    var thread2 = new Thread(() -> {
      while (!status.isDone()) {
        synchronized (status) {
          try {
            status.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
      System.out.println(status.getTotalBytes());
    });

    thread1.start();
    thread2.start();
  }
}
