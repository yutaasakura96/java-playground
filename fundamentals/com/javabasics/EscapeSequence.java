public class EscapeSequence {
  public static void main(String args[]) {
    String filepath = "c:\\Windows\\...";
    System.out.println(filepath);

    System.out.println(filepath + "\n new path");
    System.out.println(filepath + "\ttabbed");
    System.out.println("escaped quotation \"marks\"");
  }
}
