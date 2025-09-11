import java.util.List;
import java.util.ArrayList;

class Task11 {
    private String name;
    private double salary;
    private List<Employee> subordinates;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public double getSalary() {
        return salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }
}



    /**
     * TO-DO: Convert this iterative method into a recursive one.
     * \*
     * This method calculates the total salary of a manager and all their subordinates.
     * The current implementation uses a Stack to perform a depth-first traversal of the hierarchy.
     * \*
     *
     * @param manager The root employee of the hierarchy to sum up.
     * @return The total salary.
     */
    class Organization {
        public double calculateTotalSalary(Employee manager) {
            return calculateTotalSalary(manager.getSubordinates(), 0) + manager.getSalary();
        }

        private double calculateHelper(List<Employee> subs, int index) {
            if (index >= subs.size()) return 0.0;
            Employee current = subs.get(index);
            return calculateTotalSalary(current) + calculateHelper(subs, index + 1);
        }
    }