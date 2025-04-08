package fundamentals.streams;

import java.util.stream.Stream;

public class StreamsDemo {
  public static void show() {
   var stream = Stream.generate(() -> Math.random());
   stream.limit(3).forEach(n -> System.out.println(n));
  }
}
