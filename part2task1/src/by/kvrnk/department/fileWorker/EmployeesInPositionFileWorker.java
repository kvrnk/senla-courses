package by.kvrnk.department.fileWorker;

import by.kvrnk.department.generalObjects.Employee;
import by.kvrnk.department.generalObjects.EmployeeManager;
import by.kvrnk.department.generalObjects.EmployeesInPositions;

import java.util.ArrayList;
import java.util.List;

public class EmployeesInPositionFileWorker {

    public static List<EmployeesInPositions> getEmployeesInPositionList(String[] signatures) {
        List<EmployeesInPositions> result = new ArrayList<>();
        EmployeeManager employeeManager = new EmployeeManager();

        for (String signature : signatures) {
            result.add(buildEmployeesInPosition(signature, employeeManager));
        }

        return result;
    }

    private static EmployeesInPositions buildEmployeesInPosition(String signature, EmployeeManager employeeManager) {
        String[] values = signature.split(";");

        long parentId =Long.parseLong(values[0]);
        Employee employee = employeeManager.getEmployeeById(Integer.parseInt(values[1]));

        return new EmployeesInPositions(employee, parentId);
    }
}
