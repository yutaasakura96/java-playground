import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
  public static void show() {
    Collection<String> collection = new ArrayList<>();
    Collections.addAll(collection, "a", "b", "c");
    System.out.println(collection);
    System.out.println(collection.size());
    System.out.println("Does it contain a? " + collection.contains("a") );
    collection.remove("a");
    System.out.println(collection);
    collection.clear();
    System.out.println("Is the collection empty?" + collection.isEmpty());
  }
}
