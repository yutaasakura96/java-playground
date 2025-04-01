package fundamentals.generics.src;

public class Main {
  public static void main(String[] args) {
    GenericList<Integer> numbers = new GenericList<>();
    numbers.add(1);
    int number = numbers.get(0);
   }
}
