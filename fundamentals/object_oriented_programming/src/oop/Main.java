package oop;

public class Main {
  public static void main(String[] args) {
    var employee = new Employee(50_000,20);
    var employee2 = new Employee(35_000);

    int wage = employee.calculateWage(10);
    int wage2 = employee2.calculateWage();

    Employee.printNumberOfEmployees();
    System.out.println("Employee 1: " + wage);
    System.out.println("Employee 2: " + wage2);
  }
}
