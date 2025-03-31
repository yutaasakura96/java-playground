package fundamentals.generics.src;

public class Main {
  public static void main(String[] args) {
    var list = new GenericList<Integer>();
    list.add(1);
    int number = list.get(0);
  }
}
