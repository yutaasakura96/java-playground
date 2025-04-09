package fundamentals.concurrency;

public class DownloadStatus {
  private volatile boolean isDone;
  private int totalBytes;
  private int totalFiles;
  private Object totalBytesLock = new Object();

  public int getTotalBytes() {
    return totalBytes;
  }

  public void incrementTotalbytes() {
    synchronized (totalBytesLock) {
      totalBytes++;
    }
  }

  public synchronized void incrementTotalFiles() {
    totalFiles++;
  }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
