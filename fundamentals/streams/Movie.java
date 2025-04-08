package fundamentals.streams;

public class Movie {
  private String title;
  private int likes;
  private Genre genre;


  public Movie(String title, int likes) {
    this.title = title;
    this.likes = likes;
  }

  public Movie(String title, int likes, Genre genre) {
    this.title = title;
    this.genre = genre;
    this.likes = likes;
  }

  public int getLikes() {
    return likes;
  }

  public String getTitle() {
    return title;
  }

  public Genre getGenre() {
  return genre;
  }
}

