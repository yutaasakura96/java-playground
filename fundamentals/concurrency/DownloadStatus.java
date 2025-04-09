package fundamentals.concurrency;

public class DownloadStatus {
  private int totalBytes;

  public int getTotalBytes() {
    return totalBytes;
  }

  public void incrementTotalbytes() {
    totalBytes++;
  }
}
