package assignment;
class Employee {
    // Attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to calculate a new salary after a raise
    public double calculateNewSalary(double percentageRaise) {
        return salary + (salary * percentageRaise / 100);
    }

    // Method to update the salary
    public void updateSalary(double newSalary) {
        salary = newSalary;
        System.out.println("Salary updated to: " + salary);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an instance of the Employee class
        Employee employee = new Employee("vasanth", "Software Developer", 75000);

        // Displaying initial employee details
        employee.displayEmployeeDetails();

        // Calculating a new salary with a 10% raise
        double newSalary = employee.calculateNewSalary(10);

        // Updating the salary
        employee.updateSalary(newSalary);

        // Displaying updated employee details
        employee.displayEmployeeDetails();
    }
}
