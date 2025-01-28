package by.rymtsov.O.wrong;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary() {
        if (this.getName().equals("Manager")) {
            return 1000;
        } else if (this.getName().equals("Developer")) {
            return 1;
        }
        return 0;
    }
}
