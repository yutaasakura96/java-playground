package javabasics;

public class SwitchStatement {
  public static void main(String[] args) {
    int day = (int)(Math.random() * 7) + 1;
    String dayName = switch (day) {
      case 1 -> "Sunday";
      case 2 -> "Monday";
      case 3 -> "Tuesday";
      case 4 -> "Wednesday";
      case 5 -> "Thursday";
      case 6 -> "Friday";
      case 7 -> "Saturday";
      default -> "Invalid day";
    };

    System.out.println("The day is: " + dayName);
  }
}
