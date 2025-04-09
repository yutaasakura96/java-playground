package fundamentals.concurrency;

public class ThreadsDemo {
  public static void show() {
    Thread thread = new Thread(new DownloadFileTask());
    thread.start();

    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("File is ready to be scanned");
  }
}
