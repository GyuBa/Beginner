package domain;

import java.sql.Date;
import java.sql.Time;

public class BookmarkRiseSetInfoDTO {
    protected Long id;
    protected String bookamark_name;
    protected Long user_id;
    protected Date date;
    protected String location;
    protected Time sun_rise;
    protected Time sun_set;
    protected Time moon_rise;
    protected Time moon_set;
    protected double lun_age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookamark_name() {
        return bookamark_name;
    }

    public void setBookamark_name(String bookamark_name) {
        this.bookamark_name = bookamark_name;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Time getSun_rise() {
        return sun_rise;
    }

    public void setSun_rise(Time sun_rise) {
        this.sun_rise = sun_rise;
    }

    public Time getSun_set() {
        return sun_set;
    }

    public void setSun_set(Time sun_set) {
        this.sun_set = sun_set;
    }

    public Time getMoon_rise() {
        return moon_rise;
    }

    public void setMoon_rise(Time moon_rise) {
        this.moon_rise = moon_rise;
    }

    public Time getMoon_set() {
        return moon_set;
    }

    public void setMoon_set(Time moon_set) {
        this.moon_set = moon_set;
    }

    public double getLun_age() {
        return lun_age;
    }

    public void setLun_age(double lun_age) {
        this.lun_age = lun_age;
    }
}
