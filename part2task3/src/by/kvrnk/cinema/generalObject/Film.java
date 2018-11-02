package by.kvrnk.cinema.generalObject;

public class Film {
    private long id;
    private String name;
    private double duration;

    public Film(long id, String name, double duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }
}
