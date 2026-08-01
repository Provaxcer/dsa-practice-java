public class Employee extends Person {
    int salary;

    Employee (String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Salary: "+ salary);
    }
}
