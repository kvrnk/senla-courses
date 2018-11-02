package by.kvrnk.cinema.generalObject;

import java.util.Date;

public class Timetable extends Film {
    private long parentId;
    private Date time;
    private Film film;

    public Timetable(Film film, long parentId, Date time) {
        super(film.getId(), film.getName(), film.getDuration());
        this.film = new Film (film.getId(),film.getName(),film.getDuration());
        this.parentId = parentId;
        this.time = time;
    }

    public Film getFilm() {return film;}

    public long getParentId() {
        return parentId;
    }

    public Date getTime() {
        return time;
    }
}
