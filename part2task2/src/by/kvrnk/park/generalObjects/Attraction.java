package by.kvrnk.park.generalObjects;

import java.math.BigDecimal;
import java.util.Date;

public class Attraction {
    private long id;
    private String name;
    private Date fromTime;
    private Date toTime;
    private BigDecimal price;

    public Attraction(long id, String name, Date fromTime, Date toTime, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
