package by.kvrnk.cinema;

import by.kvrnk.cinema.fileWorker.CinemaFileWorker;
import by.kvrnk.cinema.fileWorker.TextFileWorker;
import by.kvrnk.cinema.fileWorker.TimetableFileWorker;
import by.kvrnk.cinema.generalObject.CinemaItem;
import by.kvrnk.cinema.generalObject.Film;
import by.kvrnk.cinema.generalObject.Timetable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Cinema {
    private long id;
    private CinemaObjects cinema;

    public Cinema(long id) {
        this.id = id;
        cinema = new CinemaObjects();
    }

    public class CinemaObjects {
        private final SimpleDateFormat formatForTime = new SimpleDateFormat("h:mm a");
        private final static String pathToFileCinemas = "./src/by/kvrnk/cinema/files/cinemas.txt";
        private final static String pathToFileTimetable = "./src/by/kvrnk/cinema/files/timetableForToday.txt";
        private List<CinemaItem> cinemas;


        public CinemaObjects() {
            cinemas = CinemaFileWorker.getCinemasList(TextFileWorker.readFromFile(pathToFileCinemas));
            fillFilmInPosition();
        }

        private void fillFilmInPosition() {
            List<Timetable> items = TimetableFileWorker.getEmployeesInPositionList(TextFileWorker.readFromFile(pathToFileTimetable));

            for (Timetable item : items) {
                this.getCinemaById(item.getParentId()).getTimetable().put(item.getTime(), item.getFilm());
            }
        }


        public CinemaItem getCinemaById(long id) {
            for (CinemaItem cinema : cinemas) {
                if (cinema.getId() == id) {
                    return cinema;
                }
            }
            return null;
        }

        public void timetableById(Long id) {
            for (CinemaItem cinema : cinemas) {
                if (id == cinema.getId()) {
                    for(Map.Entry<Date, Film> item : cinema.getTimetable().entrySet()){
                        System.out.println(formatForTime.format(item.getKey()) + " : " + item.getValue().getName());
                    }
                }
            }
        }
    }

    public void print() {
        System.out.println("Timetable for the cinema '" + cinema.getCinemaById(id).getName() + "':");
        cinema.timetableById(id);
    }

    public long getId() {
        return id;
    }
}
