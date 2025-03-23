package uicontrol;

public class Main {
  public static void main(String[] args) {
    var TextBox = new TextBox();
    var control = new UIControl(true);
    control.disable();
    System.out.println(control.isEnabled());
  }
}
