package by.kvrnk.cinema.generalObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CinemaItem {
    private long id;
    private String name;
    private String address;
    private Map<Date, Film> timetable;

    public CinemaItem(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        timetable = new HashMap<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Map<Date, Film> getTimetable() {
        return timetable;
    }
}
