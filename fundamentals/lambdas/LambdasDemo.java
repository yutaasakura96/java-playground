public class LambdasDemo {
  public LambdasDemo(String message) {
  }

  public static void show() {
    greet(message -> new LambdasDemo(message));
    greet(LambdasDemo::new);
  }

  public static void greet(Printer printer) {
    printer.print("Hello World");
  }
}
