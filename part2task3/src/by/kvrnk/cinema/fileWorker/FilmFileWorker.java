package by.kvrnk.cinema.fileWorker;

import by.kvrnk.cinema.generalObject.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmFileWorker {

    public static List<Film> getFilmList(String[] signatures) {
        List<Film> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildFilm(signature));
        }

        return result;
    }

    private static Film buildFilm(String signature) {
        String[] values = signature.split(";");

        long id = Long.parseLong(values[0]);
        String name = values[1];
        double duration = Double.parseDouble(values[2]);

        return new Film(id, name, duration);
    }
}
