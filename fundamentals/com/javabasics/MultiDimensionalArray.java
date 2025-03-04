public class MultiDimensionalArray {
  public static void main(String args[]) {
    int[][] oldSyntaxArray = oldSyntaxTwoDArray();
    int[][] newSyntaxArray = newSyntaxTwoDArray();

    System.out.println("Old Syntax Array:");
    System.out.println(java.util.Arrays.deepToString(oldSyntaxArray));

    System.out.println("New Syntax Array:");
    System.out.println(java.util.Arrays.deepToString(newSyntaxArray));
  }

  public static int[][] oldSyntaxTwoDArray() {
    int numbers[][] = new int[2][3];
    numbers[0][0] = 1;
    numbers[0][1] = 2;
    numbers[0][2] = 3;
    numbers[1][0] = 4;
    numbers[1][1] = 5;
    numbers[1][2] = 6;
    return numbers;
  }

  public static int[][] newSyntaxTwoDArray() {
    int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
    return numbers;
  }
}
