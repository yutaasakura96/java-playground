package javabasics;

public class Arrays {
  public static void main(String args[]) {
    int[] oldArray = oldArray();
    int[] newArray = newArray();
    System.out.println(java.util.Arrays.toString(oldArray));
    System.out.println(java.util.Arrays.toString(newArray));
    System.out.println("New array length:" + newArray.length);
    java.util.Arrays.sort(newArray);
    System.out.println("Sorted New array:" + java.util.Arrays.toString(newArray));

  }

  public static int[] oldArray() {
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    return numbers;
  }

  public static int[] newArray() {
    int[] numbers = { 8, 4, 7, 2, 6 };
    return numbers;
  }
}
