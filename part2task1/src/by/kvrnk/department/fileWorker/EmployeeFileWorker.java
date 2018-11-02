package by.kvrnk.department.fileWorker;

import by.kvrnk.department.generalObjects.Employee;
import by.kvrnk.department.generalObjects.EmployeeStates;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFileWorker {

    public static List<Employee> getEmployeesList(String[] signatures) {
        List<Employee> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildEmployee(signature));
        }

        return result;
    }

    private static Employee buildEmployee(String signature) {
        String[] values = signature.split(";");

        long id = Long.parseLong(values[0]);
        String fullName = values[1];
        EmployeeStates states = EmployeeStates.valueOf(values[2]);

        return new Employee(id, fullName, states);
    }
}
