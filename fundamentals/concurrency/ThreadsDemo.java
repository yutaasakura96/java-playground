package fundamentals.concurrency;

public class ThreadsDemo {
  public static void show() {
    Thread thread = new Thread(new DownloadFileTask());
    thread.start();

    try {
      thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    thread.interrupt();
  }
}
