package fundamentals.streams;

import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {
  public static void show() {
    var movies = List.of(
      new Movie("a", 10),
      new Movie("b", 20),
      new Movie("c", 30)
    );

    Predicate<Movie> isPopular = m -> m.getLikes() > 10;

    movies.stream().filter(isPopular).forEach(m -> System.out.println(m));
  }
}
