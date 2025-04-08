package fundamentals.streams;

import java.util.List;

public class StreamsDemo {
  public static void show() {
    var movies = List.of(
      new Movie("a", 10),
      new Movie("b", 20),
      new Movie("c", 30)
    );

    movies.stream().map(movie -> movie.getTitle()).forEach(name -> System.out.println(name));
  }
}
