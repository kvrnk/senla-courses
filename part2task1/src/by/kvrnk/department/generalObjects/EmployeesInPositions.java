package by.kvrnk.department.generalObjects;

public class EmployeesInPositions extends Employee {
    private long parentId;


    public EmployeesInPositions(Employee employee, long parentId) {
        super(employee.getId(), employee.getFullName(), employee.getStates());

        this.parentId = parentId;
    }

    public long getParentId() {
        return parentId;
    }
}
