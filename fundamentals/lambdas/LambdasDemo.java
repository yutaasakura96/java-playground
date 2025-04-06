
import java.util.function.Predicate;

public class LambdasDemo {

  public static void show() {
    Predicate<String> hasLeftBrace = str -> str.startsWith("{");
    Predicate<String> hasRightBrace = str -> str.endsWith("}");

    Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);

    var result = hasLeftAndRightBraces.test("{key:value}");
    System.out.println(result);
  }
}
