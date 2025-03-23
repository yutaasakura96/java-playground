package uicontrol;

public class TextBox extends UIControl {
  private String text;

    public TextBox() {
      super(true);
      System.out.println("Textbox");
    }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}

