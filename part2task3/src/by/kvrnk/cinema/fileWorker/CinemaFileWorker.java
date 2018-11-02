package by.kvrnk.cinema.fileWorker;

import by.kvrnk.cinema.generalObject.CinemaItem;

import java.util.ArrayList;
import java.util.List;

public class CinemaFileWorker {

    public static List<CinemaItem> getCinemasList(String[] signatures) {
        List<CinemaItem> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildCinema(signature));
        }

        return result;
    }

    private static CinemaItem buildCinema(String signature) {
        String[] values = signature.split(";");

        long id = Long.parseLong(values[0]);
        String name = values[1];
        String address = values[2];

        return new CinemaItem(id, name, address);
    }
}
