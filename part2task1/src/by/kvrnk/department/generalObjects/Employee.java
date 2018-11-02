package by.kvrnk.department.generalObjects;


public class Employee {
    private long id;
    private String fullName;
    private EmployeeStates states;

    public Employee(long id, String fullName, EmployeeStates states) {
        this.id = id;
        this.fullName = fullName;
        this.states = states;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public EmployeeStates getStates() {
        return states;
    }

    public void setStates(EmployeeStates states) {
        this.states = states;
    }
}
