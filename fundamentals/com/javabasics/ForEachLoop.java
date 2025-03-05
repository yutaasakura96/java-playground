public class ForEachLoop {
  public static void main(String[] args) {
    String[] fruits = {"Apple", "Banana", "Stawberry", "Kiwi", "Watermelon"};

    System.out.println("Iterating through array using for loop.");
    for (int i = 0; i < fruits.length; i++) {
      System.out.println("Item # " + (i+1) + ": "+ fruits[i]);
    }

    System.out.println("Iterating through array using for-each loop");
    for (String fruit : fruits) {
      System.out.println("Item: " + fruit);
    }
  }
}
