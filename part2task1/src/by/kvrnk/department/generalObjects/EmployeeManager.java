package by.kvrnk.department.generalObjects;

import by.kvrnk.department.fileWorker.EmployeeFileWorker;
import by.kvrnk.department.fileWorker.TextFileWorker;

import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;
    private static final String pathToFile = "./src/by/kvrnk/department/files/employees.txt";

    public EmployeeManager() {

        employees = getEmployeeFromFile();

    }

    private List<Employee> getEmployeeFromFile() {

        return EmployeeFileWorker.getEmployeesList(TextFileWorker.readFromFile(pathToFile));
    }

    public Employee getEmployeeById(long id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
