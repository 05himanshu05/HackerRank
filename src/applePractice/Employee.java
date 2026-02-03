package applePractice;

public class Employee {

    String name;
    double salary;

    // constructor, getters
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}
