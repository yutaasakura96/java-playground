package fundamentals.concurrency;

public class DownloadFileTask implements Runnable {

  private DownloadStatus status;

  @Override
  public void run() {
    System.out.println("Downloading a file: " + Thread.currentThread().getName());

    for (var i = 0; i < 10_000; i++) {
      if (Thread.currentThread().isInterrupted()) {
        return;
      }
      status.incrementTotalbytes();
    }

    System.out.println("Download complete: " + Thread.currentThread().getName());
  }
    public DownloadStatus getStatus() {
        return status;
    }
}
