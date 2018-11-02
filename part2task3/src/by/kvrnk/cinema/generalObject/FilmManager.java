package by.kvrnk.cinema.generalObject;

import by.kvrnk.cinema.fileWorker.FilmFileWorker;
import by.kvrnk.cinema.fileWorker.TextFileWorker;

import java.util.List;

public class FilmManager {
    private static String pathToFile = "./src/by/kvrnk/cinema/files/films.txt";
    private List<Film> films;

    public FilmManager() {
        films = FilmFileWorker.getFilmList(TextFileWorker.readFromFile(pathToFile));
    }

    public Film getFilmById(long id) {
        for (Film film : films) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }
}

