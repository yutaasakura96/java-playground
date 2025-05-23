package oop;

public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public static int numberOfEmployees;

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  public Employee(int baseSalary) {
    this(baseSalary, 0);
  }

  public static void printNumberOfEmployees() {
    System.out.println("Number of Employees: " + numberOfEmployees);
  }

  public int calculateWage(int extraHours) {
    return baseSalary + (extraHours * hourlyRate);
  }

  public int calculateWage() {
    return calculateWage(0);
  }

  private void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0)
      throw new IllegalArgumentException("Salary cannot be 0 or less.");
    this.baseSalary = baseSalary;
  }

  private  int getBaseSalary() {
    return baseSalary;
  }

  private void setHourlyRate(int hourlyRate) {
    if (hourlyRate <0)
      throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
    this.hourlyRate = hourlyRate;
  }

  private int getHourlyRate() {
    return hourlyRate;
  }
}
