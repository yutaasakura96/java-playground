public class Strings {
  public static void main(String args[]) {
    String message = "Hello World!!!";
    System.out.println(message);

    System.out.println(message.startsWith("H"));
    System.out.println(message.endsWith("@"));
    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());
    System.out.println(message.replace("Hello", "Goodbye"));
  }
}
