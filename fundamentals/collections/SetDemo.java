import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void show() {
    Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
    Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
    // Union(combines collections)
    // set1.addAll(set2);
    // System.out.println(set1);

    // Intersection(Returns same elements)
    // set1.retainAll(set2);
    // System.out.println(set1);

    // Difference(Returns the difference between collections)
    set1.removeAll(set2);
    System.out.println(set1);
  }
}
