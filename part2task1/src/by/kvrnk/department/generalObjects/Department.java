package by.kvrnk.department.generalObjects;

import by.kvrnk.department.fileWorker.EmployeesInPositionFileWorker;
import by.kvrnk.department.fileWorker.PositionFileWorker;
import by.kvrnk.department.fileWorker.TextFileWorker;

import java.util.List;

public class Department {
    private int id;
    private ObjectsOfDepartment objectsOfDepartment;

    public Department(int id) {
        this.id = id;
        objectsOfDepartment = new ObjectsOfDepartment();
    }

    private class ObjectsOfDepartment {
        private final static String pathToFilePositions = "./src/by/kvrnk/department/files/positions.txt";
        private final static String pathToFileEmployeesInPosition = "./src/by/kvrnk/department/files/employees in positions.txt";
        private List<Position> positions;

        public ObjectsOfDepartment() {
            positions = PositionFileWorker.getPositionsList(TextFileWorker.readFromFile(pathToFilePositions));
            fillEmployeesInPosition();
        }

        private void fillEmployeesInPosition() {
            List<EmployeesInPositions> items = EmployeesInPositionFileWorker.getEmployeesInPositionList(TextFileWorker.readFromFile(pathToFileEmployeesInPosition));

            for (EmployeesInPositions item : items) {
                this.getPositionById(item.getParentId()).getEmployees().add(item);
            }
        }

        public Position getPositionById(long id) {
            for (Position position : positions) {
                if (position.getId() == id) {
                    return position;
                }
            }
            return null;
        }

        public List<Position> getPositions() {
                return positions;
        }

    }

    public void print() {
        System.out.print("The department number" + " " + getId() + " contains" + " " + objectsOfDepartment.getPositions().size() + " " + "positions \n");
    }

    public void getEmployeesByPosition(String positionName) {
        System.out.println("Position '" + positionName + "' contains/contained: "  );
        for (Position position : objectsOfDepartment.getPositions()) {
            if (positionName.equals(position.getName())) {
                for (Employee employee : position.getEmployees()) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }

    public int getId() {
        return id;
    }

}
