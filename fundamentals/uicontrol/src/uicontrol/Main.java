package uicontrol;

public class Main {
  public static void main(String[] args) {
    var control = new UIControl();
    control.disable();
    System.out.println(control.isEnabled());
  }
}
