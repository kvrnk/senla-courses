package by.kvrnk.department.generalObjects;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private long id;
    private String positionName;
    private List<Employee> employees;

    public Position(long id, String positionName) {
        this.id = id;
        this.positionName = positionName;
        employees = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return positionName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
