package javabasics;

public class CreatingMethods {
  public static void main(String[] args) {
    String message = greetUser("John", "Doe");
    System.out.println(message);
  }

  public static String greetUser(String firstName, String lastName) {
    return "Hello " + firstName + " " + lastName;
  }
}
