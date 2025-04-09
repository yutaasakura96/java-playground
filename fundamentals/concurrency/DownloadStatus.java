package fundamentals.concurrency;

public class DownloadStatus {
  private int totalBytes;
  private int totalFiles;
  private Object totalBytesLock = new Object();
  private Object totalFilesLock = new Object();

  public int getTotalBytes() {
    return totalBytes;
  }

  public void incrementTotalbytes() {
    synchronized (totalBytesLock) {
      totalBytes++;
    }
  }

  public void incrementTotalFiles() {
    synchronized (totalFilesLock) {
      totalFiles++;
    }

  }

    public int getTotalFiles() {
        return totalFiles;
    }
}
