package EmployeeManagementSystem;

public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public boolean addEmployee(int employeeId, String employeeName, String department) {
        if (count == employees.length) {
            return false;
        }

        employees[count] = new Employee(employeeId, employeeName, department);
        count++;
        return true;
    }

    public Employee findEmployeeById(int employeeId) {
        for (int index = 0; index < count; index++) {
            if (employees[index].getEmployeeId() == employeeId) {
                return employees[index];
            }
        }
        return null;
    }

    public void displayEmployees() {
        for (int index = 0; index < count; index++) {
            System.out.println(employees[index]);
        }
    }
}
