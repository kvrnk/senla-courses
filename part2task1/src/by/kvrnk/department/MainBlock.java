package by.kvrnk.department;

import by.kvrnk.department.generalObjects.Department;

public class MainBlock {
    public static void main(String[] args) {
        Department department = new Department(1);

        department.print();
        department.getEmployeesByPosition("Project Manager");
    }
}
