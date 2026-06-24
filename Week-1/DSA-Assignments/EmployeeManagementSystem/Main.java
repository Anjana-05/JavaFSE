package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager(5);

        employeeManager.addEmployee(501, "Karan", "HR");
        employeeManager.addEmployee(502, "Pooja", "IT");
        employeeManager.addEmployee(503, "Vikram", "Finance");

        System.out.println("Employee Records:");
        employeeManager.displayEmployees();

        System.out.println();
        Employee searchedEmployee = employeeManager.findEmployeeById(502);
        if (searchedEmployee != null) {
            System.out.println("Search Result: " + searchedEmployee);
        } else {
            System.out.println("Employee not found");
        }
    }
}
