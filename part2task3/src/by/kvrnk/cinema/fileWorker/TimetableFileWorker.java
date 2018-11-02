package by.kvrnk.cinema.fileWorker;

import by.kvrnk.cinema.generalObject.Film;
import by.kvrnk.cinema.generalObject.FilmManager;
import by.kvrnk.cinema.generalObject.Timetable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimetableFileWorker {
    private static final SimpleDateFormat formatForTime = new SimpleDateFormat("h:mm");

    public static List<Timetable> getEmployeesInPositionList(String[] signatures) {
        List<Timetable> result = new ArrayList<>();
        FilmManager filmManager = new FilmManager();

        for (String signature : signatures) {
            result.add(buildEmployeesInPosition(signature, filmManager));
        }

        return result;
    }

    private static Timetable buildEmployeesInPosition(String signature, FilmManager filmManager) {
        String[] values = signature.split(";");

        try {
            long parentId = Long.parseLong(values[0]);
            Film film = filmManager.getFilmById(Integer.parseInt(values[1]));
            Date time = null;
            time = formatForTime.parse(values[2]);

            return new Timetable(film, parentId, time);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }
}
