package by.kvrnk.department.fileWorker;

import by.kvrnk.department.generalObjects.Position;

import java.util.ArrayList;
import java.util.List;

public class PositionFileWorker {

    public static List<Position> getPositionsList(String[] signatures) {
        List<Position> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildPosition(signature));
        }

        return result;
    }

    private static Position buildPosition(String signature) {
        String[] values = signature.split(";");

        long id = Long.parseLong(values[0]);
        String position = values[1];

        return new Position(id, position);
    }
}
