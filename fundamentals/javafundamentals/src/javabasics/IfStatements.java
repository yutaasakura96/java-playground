public class IfStatements {
  public static void main(String[] args) {
    int temperature = (int) (Math.random() * 45);
    System.out.println("The temperature for today is " + temperature);
    if (temperature > 30) {
      System.out.println("It's a hot day");
    } else if (temperature >= 20) {
      System.out.println("it's a good day");
    } else {
      System.out.println("it's a cold day");
    }
  }
}
