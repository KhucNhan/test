package AdvancedDemoExam.Cau1;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract int calculateSalary();

    public void addBonus(Employee employee) {
        employee.setSalary(employee.getSalary() * 1.5);
    }

    public void addBonus(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * 1.5);
            }
        }
    }
}
