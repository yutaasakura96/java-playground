package src;

public class Main {
  public static void main(String[] args) {
    User user = new Instructor(10);
    Utils.printUser(new Instructor(10));

    var instructors = new GenericList<Instructor>();
    var users = new GenericList<User>();
    Utils.printUsers(new GenericList<>());
  }
}
