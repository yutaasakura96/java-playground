package oop;

public class Main {
  public static void main(String[] args) {
    var employee = new Employee(50_000,20);
    var employee2 = new Employee(35_000, 15);

    int wage = employee.calculateWage(10);
    int wage2 = employee2.calculateWage();

    System.out.println(wage);
    System.out.println(wage2);
  }
}
